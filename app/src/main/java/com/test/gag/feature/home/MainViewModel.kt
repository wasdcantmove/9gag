package com.test.gag.feature.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.test.gag.db.models.Content
import com.test.gag.db.models.Gag
import com.test.gag.feature.home.backend.ContentUseCase
import com.test.gag.util.EmptyEventLiveData
import com.test.gag.util.Event
import com.test.gag.util.trigger
import dagger.hilt.android.lifecycle.HiltViewModel
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val useCase: ContentUseCase,
    state: SavedStateHandle
) : ViewModel() {

    var savedList = state.getLiveData<List<Gag?>?>(SAVED_GAG_LIST)

    init {
        if (state.get<MutableLiveData<List<Gag?>>>(SAVED_GAG_LIST) != null) {
            savedList = state.get<MutableLiveData<List<Gag?>?>>(SAVED_GAG_LIST)!!
        }
    }

    private val compositeDisposable = CompositeDisposable()
    val stopRefreshEvent = EmptyEventLiveData()
    val databaseClearedEvent = EmptyEventLiveData()
    val contentLoadFail = EmptyEventLiveData()
    private var page = 0L
    var dataList = mutableListOf<Gag>()

    val list: LiveData<Event<List<Gag?>?>> get() = _list
    private val _list = MutableLiveData<Event<List<Gag?>?>>()

    init {
        callApiLoadNext()
    }

    private fun onObtainedItems(items: Content) {
        when {
            _list.value?.content != null -> {
                val gagList =
                    _list.value?.content?.plus(items.data.gags)?.filterIsInstance<List<Gag>?>()
                        ?.firstOrNull()
                _list.trigger(gagList?.distinctBy { it._id })
            }
            else -> {
                _list.trigger(items.data.gags?.distinctBy { it._id })
            }
        }
        stopRefreshEvent.trigger()
    }

    fun loadLocalContent() {
        useCase.loadLocalContentPaging()
            ?.subscribeOn(Schedulers.io())
            ?.observeOn(AndroidSchedulers.mainThread())
            ?.subscribe({
                onLocalItemsLoaded(it)
            }, {
                contentLoadFail.trigger()
            })
            ?.let(compositeDisposable::add)
    }

    private fun onLocalItemsLoaded(items: List<Gag?>?) {
        val gagList =
            _list.value?.content?.plus(items)?.filterIsInstance<List<Gag>?>()?.firstOrNull()
        _list.trigger(gagList?.distinctBy { it._id })
        stopRefreshEvent.trigger()
    }

    fun callApiLoadNext() {
        useCase.loadContentNext(page)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                if (it?.meta?.code != 404) {
                    page++
                    it?.let { content -> onObtainedItems(content) }
                }
            }, {
                stopRefreshEvent.trigger()
                contentLoadFail.trigger()
            })
            .let(compositeDisposable::add)

    }

    fun clearAndReloadData() {
        useCase.deleteAll()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                dataList = mutableListOf()
                page = 0L
                databaseClearedEvent.trigger()
            }, {
                stopRefreshEvent.trigger()
                contentLoadFail.trigger()
            })
            .let(compositeDisposable::add)
    }

    fun updateLocalData() = useCase.saveContentPaging(dataList)
        .subscribeOn(Schedulers.io())
        .observeOn(AndroidSchedulers.mainThread())
        .subscribe({
        }, {
            stopRefreshEvent.trigger()
            contentLoadFail.trigger()
        })
        .let(compositeDisposable::add)

    fun saveListState() {
        savedList = MutableLiveData(dataList)
    }

    companion object {
        private const val SAVED_GAG_LIST = "savedGagList"
    }
}

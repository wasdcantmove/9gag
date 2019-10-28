package com.test.gag.feature.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.test.gag.db.models.Content
import com.test.gag.db.models.Gag
import com.test.gag.feature.home.backend.ContentUseCase
import com.test.gag.util.EmptyEventLiveData
import com.test.gag.util.Event
import com.test.gag.util.extensions.runWith
import com.test.gag.util.runner.RxRunner
import com.test.gag.util.trigger
import io.reactivex.disposables.CompositeDisposable

class MainViewModel(
    private val runner: RxRunner,
    private val useCase: ContentUseCase
) : ViewModel() {

    private val compositeDisposable = CompositeDisposable()
    val stopRefreshEvent = EmptyEventLiveData()
    val contentLoadFail = EmptyEventLiveData()

    val list: LiveData<Event<List<Gag?>?>> get() = _list
    private val _list = MutableLiveData<Event<List<Gag?>?>>()

    init {
        callApi()
    }

    fun callApi() {
        useCase.loadContent()
            .runWith(runner)
            .subscribe({
                it?.let { content -> onObtainedItems(content) }
            }, {
                stopRefreshEvent.trigger()
                contentLoadFail.trigger()
            })
            .let(compositeDisposable::add)
    }

    private fun onObtainedItems(items: Content) {
        when {
            _list.value?.content != null -> {
                useCase.saveContentPaging(_list.value?.content?.plus(items.data.gags)?.distinctBy { it?._id })
                _list.trigger(_list.value?.content?.plus(items.data.gags)?.distinctBy { it?._id })
            }
            else -> {
                useCase.saveContentPaging(items.data.gags)
                _list.trigger(items.data.gags)
            }
        }
        stopRefreshEvent.trigger()
    }

    fun loadLocalContent() {
        useCase.loadLocalContentPaging()
            ?.runWith(runner)
            ?.subscribe({
                onLocalItemsLoaded(it)
            }, {})
            ?.let(compositeDisposable::add)
    }

    private fun onLocalItemsLoaded(items: List<Gag?>?) {
        _list.trigger(items)
        stopRefreshEvent.trigger()
    }

    fun callApiLoadNext() {
        useCase.loadContentNext()
            .runWith(runner)
            .subscribe({
                it?.let { content -> onObtainedItems(content) }
            }, {
                stopRefreshEvent.trigger()
                contentLoadFail.trigger()
            })
            .let(compositeDisposable::add)

    }
}


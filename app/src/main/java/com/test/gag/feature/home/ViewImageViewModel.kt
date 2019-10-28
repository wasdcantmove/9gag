package com.test.gag.feature.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.test.gag.db.models.Gag
import com.test.gag.feature.home.backend.LocalContentRepository
import com.test.gag.util.Event
import com.test.gag.util.extensions.runWith
import com.test.gag.util.runner.RxRunner
import com.test.gag.util.trigger
import io.reactivex.disposables.CompositeDisposable

class ViewImageViewModel(
    val localContentRepository: LocalContentRepository,
    val runner: RxRunner
) : ViewModel() {


    private val compositeDisposable = CompositeDisposable()

    val gag: LiveData<Event<Gag?>> get() = _gag
    private val _gag = MutableLiveData<Event<Gag?>>()

    fun imageId(selectedImage: Long) {
        localContentRepository.loadSingleImage(selectedImage)
            ?.runWith(runner)
            ?.subscribe({
                _gag.trigger(it?.firstOrNull())
            },
                {

                }
            )?.let(compositeDisposable::add)
    }

}
package com.test.gag.feature.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.test.gag.db.models.Gag
import com.test.gag.feature.home.backend.LocalContentRepository
import com.test.gag.util.Event
import com.test.gag.util.trigger
import dagger.hilt.android.lifecycle.HiltViewModel
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

@HiltViewModel
class ViewImageViewModel @Inject constructor(
    val localContentRepository: LocalContentRepository,
) : ViewModel() {


    private val compositeDisposable = CompositeDisposable()

    val gag: LiveData<Event<Gag?>> get() = _gag
    private val _gag = MutableLiveData<Event<Gag?>>()

    fun imageId(selectedImage: Long) {
        localContentRepository.loadSingleImage(selectedImage)
            ?.subscribeOn(Schedulers.io())
            ?.observeOn(AndroidSchedulers.mainThread())
            ?.subscribe({
                _gag.trigger(it?.firstOrNull())
            },
                {

                }
            )?.let(compositeDisposable::add)
    }

    fun loadComments(): List<String> {
        return listOf(
            "This is the best MEME I've ever seen",
            "Lol, no way",
            "Repost.",
            "WOW",
            "I can't believe this post!",
            "This is amazing.",
            "Is this real?",
            "Half life 3 confirmed.",
            "NO way! Just, no way.",
            "How can this be?",
            "Hello, am I shadow banned?",
            "I can't believe how good this photo is!",
            "When did this happen?"
        ).shuffled()
    }

}
package com.test.gag.extensions

import androidx.fragment.app.Fragment
import androidx.lifecycle.LiveData
import com.test.gag.util.Event

inline fun <T : Any?> Fragment.observeEvent(liveData: LiveData<Event<T>>, crossinline observer: (T) -> Unit) {
    liveData.observe(this::getLifecycle) {
        it.getContentIfNotHandled()
            ?.let { content ->
                observer.invoke(content)
            }
    }
}

package com.test.gag.feature.home

import android.os.Bundle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Long
import kotlin.jvm.JvmStatic

data class ViewImageFragmentArgs(val selectedImage: Long) : NavArgs {
    fun toBundle(): Bundle {
        val result = Bundle()
        result.putLong("selectedImage", this.selectedImage)
        return result
    }

    companion object {
        @JvmStatic
        fun fromBundle(bundle: Bundle): ViewImageFragmentArgs {
            bundle.setClassLoader(ViewImageFragmentArgs::class.java.classLoader)
            val __selectedImage : Long
            if (bundle.containsKey("selectedImage")) {
                __selectedImage = bundle.getLong("selectedImage")
            } else {
                throw IllegalArgumentException("Required argument \"selectedImage\" is missing and does not have an android:defaultValue")
            }
            return ViewImageFragmentArgs(__selectedImage)
        }
    }
}

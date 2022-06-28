package com.test.gag.feature.home

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Long
import kotlin.jvm.JvmStatic

public data class ViewImageFragmentArgs(
  public val selectedImage: Long
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putLong("selectedImage", this.selectedImage)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("selectedImage", this.selectedImage)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): ViewImageFragmentArgs {
      bundle.setClassLoader(ViewImageFragmentArgs::class.java.classLoader)
      val __selectedImage : Long
      if (bundle.containsKey("selectedImage")) {
        __selectedImage = bundle.getLong("selectedImage")
      } else {
        throw IllegalArgumentException("Required argument \"selectedImage\" is missing and does not have an android:defaultValue")
      }
      return ViewImageFragmentArgs(__selectedImage)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): ViewImageFragmentArgs {
      val __selectedImage : Long?
      if (savedStateHandle.contains("selectedImage")) {
        __selectedImage = savedStateHandle["selectedImage"]
        if (__selectedImage == null) {
          throw IllegalArgumentException("Argument \"selectedImage\" of type long does not support null values")
        }
      } else {
        throw IllegalArgumentException("Required argument \"selectedImage\" is missing and does not have an android:defaultValue")
      }
      return ViewImageFragmentArgs(__selectedImage)
    }
  }
}

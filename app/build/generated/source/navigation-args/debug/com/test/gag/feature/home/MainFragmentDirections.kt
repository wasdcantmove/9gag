package com.test.gag.feature.home

import android.os.Bundle
import androidx.navigation.NavDirections
import com.test.gag.R
import kotlin.Int
import kotlin.Long

public class MainFragmentDirections private constructor() {
  private data class ActionHotFragmentToViewImageFragment(
    public val selectedImage: Long
  ) : NavDirections {
    public override val actionId: Int = R.id.action_hotFragment_to_viewImageFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putLong("selectedImage", this.selectedImage)
        return result
      }
  }

  public companion object {
    public fun actionHotFragmentToViewImageFragment(selectedImage: Long): NavDirections =
        ActionHotFragmentToViewImageFragment(selectedImage)
  }
}

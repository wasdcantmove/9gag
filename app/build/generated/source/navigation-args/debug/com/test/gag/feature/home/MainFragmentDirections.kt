package com.test.gag.feature.home

import android.os.Bundle
import androidx.navigation.NavDirections
import com.test.gag.R
import kotlin.Int
import kotlin.Long

class MainFragmentDirections private constructor() {
    private data class ActionHotFragmentToViewImageFragment(val selectedImage: Long) : NavDirections
            {
        override fun getActionId(): Int = R.id.action_hotFragment_to_viewImageFragment

        override fun getArguments(): Bundle {
            val result = Bundle()
            result.putLong("selectedImage", this.selectedImage)
            return result
        }
    }

    companion object {
        fun actionHotFragmentToViewImageFragment(selectedImage: Long): NavDirections =
                ActionHotFragmentToViewImageFragment(selectedImage)
    }
}

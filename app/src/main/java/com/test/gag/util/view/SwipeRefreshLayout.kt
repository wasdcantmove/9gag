package com.test.gag.util.view

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.test.gag.R

fun SwipeRefreshLayout.setContentColorScheme() {
    setColorSchemeResources(
        R.color.colorPrimaryDark,
        R.color.colorPrimary,
        R.color.colorAccent
    )
}
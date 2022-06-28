package com.test.gag.feature.home

import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.browser.customtabs.CustomTabsIntent
import androidx.core.content.ContextCompat
import com.test.gag.R
import com.test.gag.app.App
import com.test.gag.app.BaseFragment
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fresh_fragment_layout.*

@AndroidEntryPoint
class TrendingFragment : BaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View =
        inflater.inflate(R.layout.fresh_fragment_layout, container, false)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        (requireActivity().application as App)
            .appComponent
            .inject(this)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        imageView.setOnClickListener {
            context?.let { it1 -> ContextCompat.getColor(it1, R.color.colorPrimary) }?.let { it2 ->
                CustomTabsIntent
                    .Builder()
                    .setToolbarColor(it2)
                    .setShowTitle(true)
                    .build()
                    .launchUrl(context, Uri.parse("https://www.linkedin.com/in/liamwaddell/"))
            }
        }
    }

}

package com.test.gag.feature.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.viewpager.widget.ViewPager
import com.test.gag.R
import com.test.gag.app.App
import com.test.gag.app.BaseFragment
import kotlinx.android.synthetic.main.main_fragment.*
import javax.inject.Inject


class MainFragment : BaseFragment() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.main_fragment, container, false).apply {
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        (activity?.application as App)
            .component()
            .inject(this)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupViewPager(contentPager)

    }

    private fun setupViewPager(viewPager: ViewPager) {

        val titles = listOf(getString(R.string.tab_hot), getString(R.string.tab_fresh), getString(R.string.tab_trending))

        val adapter = TabbedPageAdapter(childFragmentManager, titles)
        adapter.addFragment(HotFragment())
        adapter.addFragment(FreshFragment())
        adapter.addFragment(TrendingFragment())

        gagsTab.setupWithViewPager(viewPager)
        viewPager.adapter = adapter
    }
}
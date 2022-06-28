package com.test.gag.feature.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayoutMediator
import com.test.gag.R
import com.test.gag.app.App
import com.test.gag.app.BaseFragment
import kotlinx.android.synthetic.main.main_fragment.*

class MainFragment : BaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.main_fragment, container, false).apply {
        }
    }

    override fun onResume() {
        (requireActivity() as AppCompatActivity).supportActionBar?.setDisplayHomeAsUpEnabled(false)
        super.onResume()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        (activity?.application as App)
            .appComponent
            .inject(this)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupViewPager(contentPager)

    }

    private fun setupViewPager(viewPager: ViewPager2) {

        val adapter = TabbedPageAdapter(context as FragmentActivity, pages, titles)
        viewPager.adapter = adapter
        TabLayoutMediator(gagsTab, viewPager) { tab, position ->
            tab.text = titles[position]
        }.attach()
    }

    private val titles: Array<String> by lazy {
        arrayOf(
            getString(R.string.tab_hot),
            getString(R.string.tab_fresh),
            getString(R.string.tab_trending)
        )
    }

    companion object {
        private val pages: Array<BaseFragment> by lazy {
            arrayOf(
                HotFragment(),
                FreshFragment(),
                TrendingFragment()
            )
        }
    }
}
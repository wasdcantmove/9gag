package com.test.gag.feature.home

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.test.gag.app.BaseFragment

class TabbedPageAdapter(
    activity: FragmentActivity,
    private val pages: Array<BaseFragment>,
    private val titles: Array<String>
) : FragmentStateAdapter(activity) {
    override fun getItemCount(): Int = pages.size
    override fun createFragment(position: Int): Fragment = pages[position]
    public fun getTabTitle(position: Int): String = titles[position]

}
package dev.abhishekbansal.swipecontrolviewpager2.ui.main

import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager2.adapter.FragmentStateAdapter


/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
class SectionsPagerAdapter(activity: FragmentActivity, val colorList: List<Int>) :
    FragmentStateAdapter(activity) {
    override fun getItemCount() = colorList.count()

    override fun createFragment(position: Int) = ColoredFragment.newInstance(colorList[position])
}
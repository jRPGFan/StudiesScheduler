package com.example.studiesscheduler.views

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

private const val CLASSES_SCREEN = 0
private const val SCHEDULE_SCREEN = 1

class ViewPagerAdapter(fragment: FragmentActivity, private var itemsCount: Int) :
    FragmentStateAdapter(fragment) {

    private val fragments = arrayOf(HomeScreenFragment(), ScheduleFragment())

    override fun getItemCount(): Int = itemsCount

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> fragments[CLASSES_SCREEN]
            1 -> fragments[SCHEDULE_SCREEN]
            else -> fragments[CLASSES_SCREEN]
        }
    }
}
package com.example.studiesscheduler

import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import com.example.studiesscheduler.databinding.ActivityMainBinding
import com.example.studiesscheduler.views.ViewPagerAdapter
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : FragmentActivity() {

    private lateinit var binding: ActivityMainBinding
    private val tabTitles = arrayOf("Classes", "Schedule")
    private val tabIcons = arrayOf(R.drawable.ic_home, R.drawable.ic_schedule)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
    }

    private fun init() {
        binding.viewPager.adapter = ViewPagerAdapter(this, tabTitles.size)
        binding.viewPager.isUserInputEnabled = false
        TabLayoutMediator(binding.tabs, binding.viewPager) { tab, index ->
            tab.text = tabTitles[index]
            tab.setIcon(tabIcons[index])
        }.attach()
    }
}
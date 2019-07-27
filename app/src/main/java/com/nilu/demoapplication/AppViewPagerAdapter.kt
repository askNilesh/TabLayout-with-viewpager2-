package com.nilu.demoapplication

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter


class AppViewPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> SettingsFragment.newInstance()
            1 -> SettingsFragment.newInstance()
            else -> SettingsFragment.newInstance()
        }
    }


    override fun getItemCount(): Int {
        return 3
    }
}

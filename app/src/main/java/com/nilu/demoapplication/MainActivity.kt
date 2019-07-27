package com.nilu.demoapplication

import android.annotation.SuppressLint
import android.graphics.Color
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*
import com.google.android.material.tabs.TabLayoutMediator

import com.google.android.material.tabs.TabLayout
import com.google.android.material.badge.BadgeUtils
import com.google.android.material.badge.BadgeDrawable


class MainActivity : AppCompatActivity(),SettingsFragment.OnFragmentInteractionListener {
    override fun onFragmentInteraction(uri: Uri) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        viewpager.adapter = AppViewPagerAdapter(supportFragmentManager, lifecycle)

        TabLayoutMediator(tabs, viewpager,
            TabLayoutMediator.OnConfigureTabCallback { tab, position ->
                // Styling each tab here
                tab.text = "Tab $position"
            }).attach()



    }
}

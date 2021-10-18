package com.notification.imageslider

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.notification.imageslider.adapter.ViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    // creating object of ViewPager
   private var mViewPager: ViewPager? = null

    // images array
    private var images = intArrayOf(
        R.drawable.a1, R.drawable.a2, R.drawable.a3, R.drawable.a4,
        R.drawable.a5, R.drawable.a6, R.drawable.a7, R.drawable.a8)

    // Creating Object of ViewPagerAdapter
    private var mViewPagerAdapter: ViewPagerAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initializing the ViewPager Object
        mViewPager = findViewById<View>(R.id.viewPagerMain) as ViewPager

        // Initializing the ViewPagerAdapter
        mViewPagerAdapter = ViewPagerAdapter(this, images)

        // Adding the Adapter to the ViewPager
        mViewPager!!.adapter = mViewPagerAdapter


        // Adding the circle indicator below view pager syntax is id.setViewPager(Object of view pager)
        indicator.setViewPager(mViewPager)
    }
}

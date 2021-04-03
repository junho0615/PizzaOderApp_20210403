package com.neppplus.pizzaoderapp_20210403

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neppplus.pizzaoderapp_20210403.adapters.MainViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    lateinit var mViewpagerAdapter : MainViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

    }

    override fun setValues() {

        mViewpagerAdapter = MainViewPagerAdapter(supportFragmentManager)
        mainViewPager.adapter = mViewpagerAdapter

        mainTabLayout.setupWithViewPager(mainViewPager)

    }


}
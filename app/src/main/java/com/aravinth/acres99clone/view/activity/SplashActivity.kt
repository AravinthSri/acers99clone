package com.aravinth.acres99clone.view.activity


import com.aravinth.acres99clone.R
import com.aravinth.acres99clone.base.BaseActivity
import com.aravinth.acres99clone.databinding.ActivitySplashBinding
import com.aravinth.acres99clone.view.dialog.AutoStartDialogFragment

class SplashActivity : BaseActivity<ActivitySplashBinding>() {


    override fun getLayoutRes(): Int {
        return R.layout.activity_splash
    }

    override fun init() {
        supportActionBar?.hide()
    }

    override fun setupDefault() {

        val dialog=AutoStartDialogFragment()
        dialog.show(supportFragmentManager,"dialog")

    }

    override fun setupEvent() {

    }

}
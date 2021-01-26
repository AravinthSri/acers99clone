package com.aravinth.acres99clone.base

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

abstract class BaseActivity<DB : ViewDataBinding>:AppCompatActivity() {

    @LayoutRes
    abstract fun getLayoutRes(): Int

    lateinit var binding:DB

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this, getLayoutRes()) as DB
        init()
        setupDefault()
        setupEvent()
    }

    abstract fun init()
    abstract fun setupDefault()
    abstract fun setupEvent()


}
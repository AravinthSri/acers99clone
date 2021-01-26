package com.aravinth.acres99clone.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.Fragment

abstract class BaseDialogFragment<DB : ViewDataBinding>:DialogFragment() {

    @LayoutRes
    abstract fun getLayoutRes(): Int

    lateinit var binding:DB


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(inflater, getLayoutRes(), container, false)
        init()
        setupDefault()
        setupEvent()
        return binding.root
    }

    abstract fun init()
    abstract fun setupDefault()
    abstract fun setupEvent()


}
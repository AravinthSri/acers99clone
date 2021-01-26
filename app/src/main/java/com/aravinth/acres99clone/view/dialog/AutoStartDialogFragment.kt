package com.aravinth.acres99clone.view.dialog

import com.aravinth.acres99clone.R
import com.aravinth.acres99clone.base.BaseDialogFragment
import com.aravinth.acres99clone.databinding.DialogFragmentAutoStartBinding

class AutoStartDialogFragment: BaseDialogFragment<DialogFragmentAutoStartBinding>() {


    override fun getLayoutRes(): Int {
        return R.layout.dialog_fragment_auto_start
    }

    override fun init() {
        binding.smAutoRun.isSelected=true
    }

    override fun setupDefault() {

    }

    override fun setupEvent() {

    }
}
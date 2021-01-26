package com.aravinth.acres99clone.utils

import android.app.Activity
import android.content.Context
import android.util.Log
import androidx.fragment.app.Fragment

fun Activity.printError(message:String){
    Log.e("TAG", "printError: $message")
}

fun Fragment.printError(message:String){
    Log.e("TAG", "printError: $message")
}

fun Context.printError(message:String){
    Log.e("TAG", "printError: $message")
}
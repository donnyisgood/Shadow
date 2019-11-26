package com.google.samples.apps.sunflower

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity

/**
 * Created by madong on 2019-11-26.
 */
@SuppressLint("Registered")
open class BaseActivity : AppCompatActivity(), SampleInterface {
    override fun normalMethod() = Unit
}
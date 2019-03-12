package io.android_architecture.samplebaseapplicationmvp.ui

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {

    //Called when Activity's contentViewAssigned
    abstract fun createUI(savedInstanceState: Bundle?)

    @LayoutRes
    abstract fun getContentView(): Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getContentView())

        createUI(savedInstanceState)
    }
}
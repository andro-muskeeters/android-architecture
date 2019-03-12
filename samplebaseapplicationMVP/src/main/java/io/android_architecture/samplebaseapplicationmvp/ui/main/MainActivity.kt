package io.android_architecture.samplebaseapplicationmvp.ui.main

import android.os.Bundle
import io.android_architecture.samplebaseapplicationmvp.R
import io.android_architecture.samplebaseapplicationmvp.ui.BaseActivity
import io.android_architecture.base.util.replaceFragmentInActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun getContentView() = R.layout.activity_main

    override fun createUI(savedInstanceState: Bundle?) {
        replaceFragmentInActivity(MainFragment(), layout_fragment)
    }
}
package io.android_architecture.base.ui.test

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import io.android_architecture.base.R
import io.android_architecture.base.databinding.ActivityTestBinding
import io.android_architecture.base.ui.test.TestModel

/**
 * Created by nikinci on 2019-03-18.
 */

class TestActivity : AppCompatActivity() {

    lateinit var binding: ActivityTestBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =
            DataBindingUtil.setContentView(this, R.layout.activity_test)
        binding.testModel =
                TestModel("https://www.nelerneler.com/content/images/medium/0038098_fikriye-emocan-3d-pelus-oyuncak.png")

    }


    @LayoutRes
    protected open fun getContentViewLayoutResId(): Int {
        return R.layout.activity_test
    }

}
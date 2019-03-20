package io.android_architecture.base.core.base

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {

    companion object {
        var TAG = ""
    }

    /**
     *
     * Provide layout resource id of an Fragment
     */
    @LayoutRes
    abstract fun layoutRes(): Int

    /**
     *
     * Called after setContentView().
     */
    abstract fun populateUI()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        TAG = this::class.java.simpleName

        //You can implement your initial common setup about this Fragment instance here.

        if (this !is BaseBindingActivity<*>) {
            setContentView(layoutRes())
            populateUI()
        }
    }
}
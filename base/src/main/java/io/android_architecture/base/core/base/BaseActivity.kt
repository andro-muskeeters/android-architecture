package io.android_architecture.base.core.base

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {

    protected val TAG = this::class.java.simpleName

    /**
     *
     * Provide layout resource id of an Fragment
     */
    @LayoutRes
    abstract fun getLayoutRes(): Int

    /**
     *
     * Called after setContentView().
     */
    abstract fun populateUI(savedInstanceState: Bundle?)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //You can implement your initial common setup about this Fragment instance here.

        if (this !is BaseBindingActivity<*>) {
            setContentView(getLayoutRes())
            populateUI(savedInstanceState)
        }
    }
}
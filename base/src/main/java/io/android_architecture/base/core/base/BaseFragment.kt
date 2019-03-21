package io.android_architecture.base.core.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment

abstract class BaseFragment : Fragment() {

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
     * Called after onViewCreated()
     */
    abstract fun populateUI(savedInstanceState: Bundle?)

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        TAG = this::class.java.simpleName

        //You can implement your initial common setup about this Fragment instance here.

        return inflater.inflate(layoutRes(), container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        populateUI(savedInstanceState)
    }
}
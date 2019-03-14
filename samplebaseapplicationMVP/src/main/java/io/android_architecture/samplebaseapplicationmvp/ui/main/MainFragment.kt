package io.android_architecture.samplebaseapplicationmvp.ui.main

import android.os.Bundle
import android.os.Handler
import android.view.View
import io.android_architecture.samplebaseapplicationmvp.R
import io.android_architecture.samplebaseapplicationmvp.ui.BaseFragment
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment : BaseFragment(), MainContract.View {

    override val presenter by lazy { MainPresenter(this) }

    override fun getViewId() = R.layout.fragment_main

    override fun createUI(rootView: View, savedInstanceState: Bundle?) {
        Handler().postDelayed({
            progress_center.hide()
            text_sample_center.visibility = View.VISIBLE
        }, 3 * 1000)
    }

    override fun showLoading() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun hideLoading() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
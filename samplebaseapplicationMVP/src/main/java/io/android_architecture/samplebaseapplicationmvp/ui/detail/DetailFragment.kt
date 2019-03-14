package io.android_architecture.samplebaseapplicationmvp.ui.detail

import android.os.Bundle
import android.view.View
import io.android_architecture.samplebaseapplicationmvp.R
import io.android_architecture.samplebaseapplicationmvp.ui.BaseFragment

class DetailFragment : BaseFragment(), DetailContract.View {

    override val presenter by lazy { DetailPresenter(this@DetailFragment) }

    override fun getViewId() = R.layout.fragment_detail

    override fun createUI(rootView: View, savedInstanceState: Bundle?) {

    }

    override fun showLoading() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun hideLoading() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
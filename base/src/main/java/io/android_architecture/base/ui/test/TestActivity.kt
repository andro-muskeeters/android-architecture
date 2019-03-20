package io.android_architecture.base.ui.test

import androidx.core.os.bundleOf
import io.android_architecture.base.R
import io.android_architecture.base.core.base.BaseActivity
import io.android_architecture.base.core.util.extensions.addFragment
import kotlinx.android.synthetic.main.activity_test.*

/**
 * Created by nikinci on 2019-03-18.
 */

class TestActivity : BaseActivity() {

    companion object {
        const val URL = "arg_url"
        const val url = "https://www.nelerneler.com/content/images/medium/0038098_fikriye-emocan-3d-pelus-oyuncak.png"
    }

    override fun layoutRes() = R.layout.activity_test

    override fun populateUI() {
        addFragment(layout_container, TestFragment().apply {
            arguments = bundleOf(Pair(URL, url))
        })
    }
}
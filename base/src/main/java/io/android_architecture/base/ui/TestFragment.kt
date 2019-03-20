package io.android_architecture.base.ui

import io.android_architecture.base.R
import io.android_architecture.base.core.base.BaseBindingFragment
import io.android_architecture.base.databinding.FragmentTestBinding
import io.android_architecture.base.model.TestModel
import io.android_architecture.base.ui.TestActivity.Companion.URL

class TestFragment : BaseBindingFragment<FragmentTestBinding>() {

    override fun layoutRes() = R.layout.fragment_test

    override fun populateUI() {
        arguments?.getString(URL)?.let { url ->
            fragmentBinding?.testModel = TestModel(url)
        }
    }
}
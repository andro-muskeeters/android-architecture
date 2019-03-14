package io.android_architecture.samplebaseapplicationmvp.ui.main

import io.android_architecture.samplebaseapplicationmvp.BasePresenter
import io.android_architecture.samplebaseapplicationmvp.BaseView

interface MainContract {

    interface View: BaseView<MainPresenter> {

    }

    abstract class Presenter: BasePresenter() {

    }
}
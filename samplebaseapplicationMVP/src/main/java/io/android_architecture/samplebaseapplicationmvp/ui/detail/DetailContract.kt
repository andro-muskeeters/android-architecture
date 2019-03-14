package io.android_architecture.samplebaseapplicationmvp.ui.detail

import io.android_architecture.samplebaseapplicationmvp.BasePresenter
import io.android_architecture.samplebaseapplicationmvp.BaseView

interface DetailContract {

    interface View: BaseView<DetailPresenter> {

    }

    abstract class Presenter: BasePresenter() {

    }
}
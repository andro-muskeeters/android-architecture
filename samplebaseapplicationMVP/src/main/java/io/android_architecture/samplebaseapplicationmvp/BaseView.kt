package io.android_architecture.samplebaseapplicationmvp

interface BaseView<T> {

    val presenter: T

    fun showLoading()

    fun hideLoading()
}
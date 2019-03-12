package io.android_architecture.samplebaseapplicationmvp.view

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import io.android_architecture.base.view.BaseTextView

class SampleTextView : BaseTextView {

    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)

    constructor(context: Context, attrs: AttributeSet?, defStyle: Int) : super(context, attrs, defStyle)

    init {
        Log.d(this.toString(), "init")
    }
}
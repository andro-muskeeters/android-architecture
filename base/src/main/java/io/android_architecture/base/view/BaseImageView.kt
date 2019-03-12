package io.android_architecture.base.view

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatImageView
import io.android_architecture.base.R

open class BaseImageView @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = R.attr.baseImageStyle) :
    AppCompatImageView(context, attrs, defStyleAttr) {
}
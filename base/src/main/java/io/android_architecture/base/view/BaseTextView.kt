package io.android_architecture.base.view

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView
import io.android_architecture.base.R

open class BaseTextView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.baseTextStyle
) :
    AppCompatTextView(context, attrs, defStyleAttr) {
}
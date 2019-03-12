package io.android_architecture.base.view

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatEditText
import io.android_architecture.base.R

open class BaseEditText @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = R.attr.baseEditTextStyle) :
    AppCompatEditText(context, attrs, defStyleAttr) {
}
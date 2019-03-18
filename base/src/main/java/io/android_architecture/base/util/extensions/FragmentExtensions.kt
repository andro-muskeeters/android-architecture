package io.android_architecture.base.util.extensions

import android.widget.Toast
import androidx.annotation.StringRes
import androidx.fragment.app.Fragment

/**
 * Created by nikinci on 2019-02-28.
 */


fun Fragment.toast(message: String?, duration: Int = Toast.LENGTH_SHORT) {
    context?.run {
        toast(message,duration)
    }
}
fun Fragment.toast(@StringRes textId: Int, duration: Int = Toast.LENGTH_SHORT) {
    context?.run {
        toast(textId,duration)
    }
}


fun Fragment.hideSoftKeyboard() {
    activity?.hideKeyboard()
}

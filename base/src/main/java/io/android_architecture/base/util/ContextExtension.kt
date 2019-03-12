package io.android_architecture.base.util

import android.content.ContextWrapper
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

/**
 *
 * @param Context object to create dialog or view context related operation like Glide or Dialog's.
 *
 */
inline fun <Context, T> Context?.isRunning(block: (Context) -> (T)): T? {
    return if (this != null && (this is AppCompatActivity && !isDestroyed && !isFinishing)
        || (this is Fragment && isAdded && !isRemoving)
        || (this is ContextWrapper && baseContext is AppCompatActivity
                && !(baseContext as AppCompatActivity).isDestroyed
                && !(baseContext as AppCompatActivity).isFinishing)) {
        block(this)
    } else {
        null
    }
}

package io.android_architecture.base.core.util.binding

import android.graphics.drawable.Drawable
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import io.android_architecture.base.core.util.module.GlideApp


/**
 * Created by nikinci on 2019-03-18.
 */

object BindingSetter {

    @JvmStatic
    @BindingAdapter(value = ["imageUrl", "placeholder", "error"], requireAll = false)
    fun ImageView.setImageUrl(url: String?, placeholder: Drawable?, error: Drawable?) {
        url?.let {
            GlideApp.with(context).load(url).placeholder(placeholder).error(error).into(this)
        }
    }
}
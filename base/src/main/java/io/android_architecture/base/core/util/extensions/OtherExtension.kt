package io.android_architecture.base.core.util.extensions

import android.content.Context
import android.graphics.Bitmap
import android.os.Build
import android.util.Base64
import android.widget.EditText
import android.widget.ImageView
import com.bumptech.glide.Glide
import io.android_architecture.base.core.util.extensions.isRunning
import java.io.ByteArrayOutputStream
import java.io.IOException

/**
 * Extension method to check context if null before load imageView from url.
 */
fun ImageView.safeLoadFromUrl(imageUrl: String, context: Context) {
    context?.isRunning {
        Glide.with(this).load(imageUrl).into(this)
    }
}


/**
 * Extension method to load imageView from url.
 */
fun ImageView.loadFromUrl(imageUrl: String) {
    Glide.with(this).load(imageUrl).into(this)
}

/**
 * Extension method to get value from EditText.
 */
val EditText.value
    get() = text.toString()


/**
 * Extension method to check is aboveApi.
 */
inline fun aboveApi(api: Int, included: Boolean = false, block: () -> Unit) {
    if (Build.VERSION.SDK_INT > if (included) api - 1 else api) {
        block()
    }
}

/**
 * Extension method to check is belowApi.
 */
inline fun belowApi(api: Int, included: Boolean = false, block: () -> Unit) {
    if (Build.VERSION.SDK_INT < if (included) api + 1 else api) {
        block()
    }
}

/**
 * Extension method to get base64 string for Bitmap.
 */
fun Bitmap.toBase64(): String {
    var result = ""
    val baos = ByteArrayOutputStream()
    try {
        compress(Bitmap.CompressFormat.JPEG, 100, baos)
        baos.flush()
        baos.close()
        val bitmapBytes = baos.toByteArray()
        result = Base64.encodeToString(bitmapBytes, Base64.DEFAULT)
    } catch (e: IOException) {
        e.printStackTrace()
    } finally {
        try {
            baos.flush()
            baos.close()
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }
    return result
}


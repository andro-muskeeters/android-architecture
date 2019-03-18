package io.android_architecture.base.util.pref

import android.content.Context

/**
 * Created by mehmetali on 3/18/19.
 */
interface Pref {

    fun <T> put(key: String, value: T)

    fun <T> get(key: String): T?

    fun <T> get(key: String, defaultValue: T): T

    fun delete(key: String)

    fun deleteAll()

    fun contains(key: String)

    fun getEntryCount()

    fun init()
}
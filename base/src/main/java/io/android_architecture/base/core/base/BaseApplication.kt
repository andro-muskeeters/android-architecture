package io.android_architecture.base.core.base

import android.content.Context
import androidx.multidex.MultiDexApplication
import io.android_architecture.base.core.util.pref.PrefHawkImpl
import io.android_architecture.base.core.util.pref.Pref

class BaseApplication : MultiDexApplication() {

    companion object {

        lateinit var instance: BaseApplication
        private val pref: Pref = PrefHawkImpl
    }

    init {
        instance = this
    }

    fun applicationContext(): Context {
        return instance.applicationContext
    }

    override fun onCreate() {
        super.onCreate()

        pref.init()
    }
}
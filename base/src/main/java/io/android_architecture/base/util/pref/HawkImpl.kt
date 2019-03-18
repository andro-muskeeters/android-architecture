package io.android_architecture.base.util.pref

import com.orhanobut.hawk.Hawk
import io.android_architecture.base.core.BaseApplication

/**
 * Created by mehmetali on 3/18/19.
 */
object HawkImpl : Pref {

    init {
        Hawk.init(BaseApplication.instance.applicationContext()).build()
    }

    override fun <T> get(key: String): T? {
        return Hawk.get<T>(key)
    }

    override fun <T> put(key: String, value: T) {
        Hawk.put(key, value)
    }

    override fun <T> get(key: String, defaultValue: T): T {
        return Hawk.get(key, defaultValue)
    }

    override fun delete(key: String) {
        Hawk.delete(key)
    }

    override fun deleteAll() {
        Hawk.deleteAll()
    }

    override fun contains(key: String) {
        Hawk.contains(key)
    }

    override fun getEntryCount() {
        Hawk.count()
    }
}
package io.android_architecture.samplebaseapplicationmvp.util

import android.os.Handler
import android.os.Looper
import java.util.concurrent.Executors

const val THREAD_COUNT = 3

fun runOnIOThread(f: () -> Unit) = Executors.newSingleThreadExecutor().execute(f)

fun runOnNetworkThread(f: () -> Unit) = Executors.newFixedThreadPool(THREAD_COUNT).execute(f)

fun runOnMainThread(f: () -> Unit) = Handler(Looper.getMainLooper()).post(f)
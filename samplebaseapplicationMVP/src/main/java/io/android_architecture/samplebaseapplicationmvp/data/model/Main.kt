package io.android_architecture.samplebaseapplicationmvp.data.model

import com.google.gson.annotations.SerializedName

data class Main(
    val temp: Double,
    val pressure: Int,
    val humidity: Int,
    @SerializedName("temp_min") val tempMin: Double,
    @SerializedName("temp_max") val tempMax: Double
)
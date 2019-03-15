package io.android_architecture.samplebaseapplicationmvp.data.model

data class GroupResponse(
    val cnt: Int,
    val list: List<WeatherResponse>,
    val message: String
)
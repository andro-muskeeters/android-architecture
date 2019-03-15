package io.android_architecture.samplebaseapplicationmvp.data.source

import io.android_architecture.samplebaseapplicationmvp.data.model.WeatherResponse

interface WeatherDataSource {

    fun getWeather(callback: WeatherResponseCallback, vararg ids: Int) //city id or city ids.

    fun getWeather(callback: WeatherResponseCallback, vararg names: String) //city name or city names

    fun refreshWeatherData() //refresh current weather data.

    fun deleteAllWeatherData()

    fun deleteWeather(vararg ids: Int)

    fun deleteWeather(vararg names: String)

    interface WeatherResponseCallback {

        fun onGetWeatherData(weatherResponses: List<WeatherResponse>)

        fun onError(reason: String?)
    }
}
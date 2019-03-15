package io.android_architecture.samplebaseapplicationmvp.data.source

import io.android_architecture.samplebaseapplicationmvp.data.model.WeatherResponse

class WeatherRepository(
    private val weatherLocalDataSource: WeatherDataSource,
    private val weatherRemoteDataSource: WeatherDataSource
) : WeatherDataSource {

    override fun getWeather(callback: WeatherDataSource.WeatherResponseCallback, vararg ids: Int) {
        weatherRemoteDataSource.getWeather(callback, *ids)
    }

    override fun getWeather(callback: WeatherDataSource.WeatherResponseCallback, vararg names: String) {
        weatherRemoteDataSource.getWeather(object: WeatherDataSource.WeatherResponseCallback {
            override fun onGetWeatherData(weatherResponses: List<WeatherResponse>) {
                //
            }

            override fun onError(reason: String?) {
                callback.onError(reason)
            }
        }, *names)
    }

    override fun refreshWeatherData() {
        weatherRemoteDataSource.refreshWeatherData()
    }

    override fun deleteAllWeatherData() {
        weatherLocalDataSource.deleteAllWeatherData()
    }

    override fun deleteWeather(vararg ids: Int) {
        weatherLocalDataSource.deleteWeather(*ids)
    }

    override fun deleteWeather(vararg names: String) {
        weatherLocalDataSource.deleteWeather(*names)
    }
}
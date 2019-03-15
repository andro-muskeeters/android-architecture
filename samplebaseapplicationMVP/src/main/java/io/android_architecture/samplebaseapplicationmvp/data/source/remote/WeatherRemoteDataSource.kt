package io.android_architecture.samplebaseapplicationmvp.data.source.remote

import io.android_architecture.samplebaseapplicationmvp.data.source.WeatherDataSource

class WeatherRemoteDataSource: WeatherDataSource {
    override fun getWeather(callback: WeatherDataSource.WeatherResponseCallback, vararg ids: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getWeather(callback: WeatherDataSource.WeatherResponseCallback, vararg names: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun refreshWeatherData() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun deleteAllWeatherData() {
        //Not required.
    }

    override fun deleteWeather(vararg ids: Int) {
        //Not required.
    }

    override fun deleteWeather(vararg names: String) {
        //Not required.
    }
}
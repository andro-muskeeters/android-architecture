package io.android_architecture.samplebaseapplicationmvp.data.source.local

import io.android_architecture.samplebaseapplicationmvp.data.source.WeatherDataSource
import io.android_architecture.samplebaseapplicationmvp.util.runOnIOThread

class WeatherLocalDataSource(val weatherDao: WeatherDao) : WeatherDataSource {
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
        runOnIOThread { weatherDao.deleteWeatherResponses() }
    }

    override fun deleteWeather(vararg ids: Int) {
        runOnIOThread { weatherDao.deleteWeatherResponse(*ids) }
    }

    override fun deleteWeather(vararg names: String) {
        runOnIOThread { weatherDao.deleteWeatherResponse(*names) }
    }
}
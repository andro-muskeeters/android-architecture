package io.android_architecture.samplebaseapplicationmvp.data.source.remote

import io.android_architecture.samplebaseapplicationmvp.data.model.GroupResponse
import io.android_architecture.samplebaseapplicationmvp.data.model.WeatherResponse
import io.android_architecture.samplebaseapplicationmvp.util.Constants.APP_ID
import io.android_architecture.samplebaseapplicationmvp.util.Constants.FIND
import io.android_architecture.samplebaseapplicationmvp.util.Constants.GROUP
import io.android_architecture.samplebaseapplicationmvp.util.Constants.ID
import io.android_architecture.samplebaseapplicationmvp.util.Constants.NAME
import io.android_architecture.samplebaseapplicationmvp.util.Constants.WEATHER
import io.android_architecture.samplebaseapplicationmvp.util.Constants.WEATHER_BASE_URL
import retrofit2.Callback
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherService {

    @GET(WEATHER)
    fun getWeather(@Query(APP_ID) appId: String, @Query(ID) id: Int): Callback<WeatherResponse>

    @GET(WEATHER)
    fun getWeather(@Query(APP_ID) appId: String, @Query(NAME) name: String): Callback<WeatherResponse>

    @GET(FIND)
    fun getWeatherList(@Query(APP_ID) appId: String, @Query(GROUP) vararg idList: Int): Callback<GroupResponse>

    companion object {

        fun getRetrofit() =
            Retrofit.Builder()
                .baseUrl(WEATHER_BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
    }
}
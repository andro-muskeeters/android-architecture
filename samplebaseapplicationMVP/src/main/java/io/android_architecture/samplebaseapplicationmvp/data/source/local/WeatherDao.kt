package io.android_architecture.samplebaseapplicationmvp.data.source.local

import androidx.room.Dao
import androidx.room.Query
import io.android_architecture.samplebaseapplicationmvp.data.model.WeatherResponse

@Dao
interface WeatherDao {

    @Query("SELECT * FROM weather_responses")
    fun getWeatherResponses(): List<WeatherResponse>

    @Query("SELECT * FROM weather_responses WHERE id IS (:id)")
    fun getWeatherResponses(id: Int): List<WeatherResponse>

    @Query("SELECT * FROM weather_responses WHERE name IS (:name)")
    fun getWeatherResponses(name: String): List<WeatherResponse>
}
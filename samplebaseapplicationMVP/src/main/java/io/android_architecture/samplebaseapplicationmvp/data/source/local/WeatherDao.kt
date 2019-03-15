package io.android_architecture.samplebaseapplicationmvp.data.source.local

import androidx.room.*
import io.android_architecture.samplebaseapplicationmvp.data.model.WeatherResponse

@Dao
interface WeatherDao {

    @Query("SELECT * FROM weather_responses")
    fun getWeatherResponses(): List<WeatherResponse>

    @Query("SELECT * FROM weather_responses WHERE id IS :id")
    fun getWeatherResponses(id: Int): List<WeatherResponse>

    @Query("SELECT * FROM weather_responses WHERE name IS :name")
    fun getWeatherResponses(name: String): List<WeatherResponse>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addWeatherResponses(vararg weatherResponse: WeatherResponse)

    @Query("DELETE FROM weather_responses")
    fun deleteWeatherResponses()

    @Query("DELETE FROM weather_responses WHERE id IN (:ids)")
    fun deleteWeatherResponse(vararg ids: Int)

    @Query("SELECT * FROM weather_responses WHERE name IN (:names)")
    fun deleteWeatherResponse(vararg names: String)
}
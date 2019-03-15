package io.android_architecture.samplebaseapplicationmvp.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "weather_responses")
data class WeatherResponse(
    @ColumnInfo val coord: Coord,
    @ColumnInfo val weather: List<Weather>,
   val base: String,
    @ColumnInfo val main: Main,
    val visibility: Int,
    @ColumnInfo val wind: Wind,
    @ColumnInfo val clouds: Clouds,
    @ColumnInfo val dt: Int,
    @ColumnInfo val sys: Sys,
    @PrimaryKey val id: Int,
    @ColumnInfo val name: String,
    @ColumnInfo val cod: Int,
    val message: String
)
package io.android_architecture.samplebaseapplicationmvp.data.source.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import io.android_architecture.samplebaseapplicationmvp.data.model.WeatherResponse

@Database(entities = [WeatherResponse::class], version = 1, exportSchema = false)
abstract class WeatherDatabase : RoomDatabase() {

    companion object {

        @Volatile
        private var INSTANCE: WeatherDatabase? = null

        fun getInstance(context: Context) = INSTANCE ?: synchronized(this) {
            INSTANCE ?: Room.databaseBuilder(context, WeatherDatabase::class.java, "weather_database")
                .build()
                .also { INSTANCE = it }
        }
    }
}
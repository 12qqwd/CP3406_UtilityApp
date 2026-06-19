package au.edu.jcu.cp3406_cp5307_utilityappstartertemplate

import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApi {

    @GET("v1/forecast")
    suspend fun getWeather(

        @Query("latitude")
        latitude: Double = -19.2589,

        @Query("longitude")
        longitude: Double = 146.8169,

        @Query("current")
        current: String =
            "temperature_2m,relative_humidity_2m,wind_speed_10m"

    ): WeatherResponse

}

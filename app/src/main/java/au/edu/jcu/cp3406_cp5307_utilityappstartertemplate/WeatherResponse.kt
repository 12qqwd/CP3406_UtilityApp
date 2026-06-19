package au.edu.jcu.cp3406_cp5307_utilityappstartertemplate

data class WeatherResponse(

    val current: CurrentWeather

)

data class CurrentWeather(

    val temperature_2m: Double,

    val relative_humidity_2m: Int,

    val wind_speed_10m: Double

)

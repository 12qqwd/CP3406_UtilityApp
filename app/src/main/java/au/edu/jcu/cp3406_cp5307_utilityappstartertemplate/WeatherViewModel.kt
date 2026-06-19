package au.edu.jcu.cp3406_cp5307_utilityappstartertemplate

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class WeatherViewModel : ViewModel() {

    private val repository = WeatherRepository()

    var temperature = mutableStateOf("--")
    var humidity = mutableStateOf("--")
    var windSpeed = mutableStateOf("--")

    init {

        loadWeather()

    }



    private fun loadWeather() {

        viewModelScope.launch {

            try {

                val weather = repository.getWeather()

                temperature.value =
                    weather.current.temperature_2m.toString()

                humidity.value =
                    weather.current.relative_humidity_2m.toString()

                windSpeed.value =
                    weather.current.wind_speed_10m.toString()

            } catch (e: Exception) {

                temperature.value = "Error"

            }

        }

    }

}
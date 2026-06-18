# Weather Utility App – CP3406 / CP5307

This is a simple Android weather utility application developed for Assessment 1 of CP3406 / CP5307.

The app provides users with quick, at-a-glance weather information including:

* Current temperature
* Humidity
* Wind speed

Weather data is retrieved from the Open-Meteo API using Retrofit.

---

## Getting Started

### How to Run

1. Clone or download this repository.
2. Open the project in Android Studio.
3. Run the application on an Android emulator or physical device (API 24+).

---

## App Features

### Utility Screen

* Displays current weather information.
* Shows:

  * Temperature (°C)
  * Humidity (%)
  * Wind Speed (km/h)
* Retrieves live data from Open-Meteo API.

### Settings Screen

* Displays temperature unit options.
* Provides a simple settings interface for future extension.

---

## Architecture

The application follows modern Android development practices:

* Jetpack Compose for UI
* Material Design 3
* ViewModel for state management
* Repository Pattern
* Retrofit for network requests
* Coroutines for asynchronous operations

---

## API Used

Open-Meteo Weather API

https://open-meteo.com/

Endpoint:

https://api.open-meteo.com/v1/forecast

---

## Project Structure

MainActivity.kt

* Main activity of the application.
* Contains navigation between Utility and Settings screens.

WeatherResponse.kt

* Data classes for parsing weather API responses.

WeatherApi.kt

* Retrofit API interface.

WeatherRepository.kt

* Handles network communication.

WeatherViewModel.kt

* Stores UI state and retrieves weather data.

---

## Author

Student Name: YOUR NAME

Subject: CP3406 / CP5307

Assessment: Assessment 1 – Utility App

---

## License

This project was developed for educational purposes as part of CP3406 / CP5307 at James Cook University.


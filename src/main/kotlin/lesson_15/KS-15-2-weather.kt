package org.example.lesson_15

fun main() {
    val weather = WeatherServer()

    val temperature = Temperature(15)

    val precipitationAmount = PrecipitationAmount(20)

    weather.sendDataWeather(temperature)
    weather.sendDataWeather(precipitationAmount)
}

abstract class WeatherStationStats

class WeatherServer {

    fun sendDataWeather(data: WeatherStationStats) {

        if (data is Temperature) {
            println("Температура равна: ${data.temp} градусов ")
        } else if (data is PrecipitationAmount) {
            println("Количество осадков: ${data.precipitation}мм")
        }
    }
}

class Temperature(val temp: Int) : WeatherStationStats()

class PrecipitationAmount(val precipitation: Int) : WeatherStationStats()
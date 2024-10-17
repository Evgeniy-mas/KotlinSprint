package org.example.lesson_12

import kotlin.random.Random

fun main() {
    val weatherMonth = WeatherInfo4()

    for (i in 1..DAY) {
        val dayTimeTemp = (21..33).random()
        val dayNightTemp = (12..24).random()
        val isDayRain = Random.nextBoolean()
        weatherMonth.addValuesWeather(dayTimeTemp, dayNightTemp, isDayRain)
    }

    val temperatureDayAverage = weatherMonth.weatherRandom.map { it.dayTimeTemp }.average()
    println("Среднее значение дневных температур:  ${temperatureDayAverage.toInt()}")

    val temperatureNightAverage = weatherMonth.weatherRandom.map { it.dayNightTemp }.average()
    println("Среднее значение ночных температур: ${temperatureNightAverage.toInt()}")

    val dayPrecipitation = weatherMonth.weatherRandom.count { it.isDayRain }
    println("Количество дней с осадками: $dayPrecipitation")
}

class WeatherInfo4(val dayTimeTemp: Int = 0, val dayNightTemp: Int = 0, val isDayRain: Boolean = false) {
    val weatherRandom = mutableListOf<WeatherInfo4>()

    fun addValuesWeather(day: Int, night: Int, precipitation: Boolean) {
        weatherRandom.add(WeatherInfo4(dayTimeTemp = day, dayNightTemp = night, isDayRain = precipitation))
    }
}

const val DAY = 30
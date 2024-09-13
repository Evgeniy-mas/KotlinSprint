package org.example.lesson_12


fun main() {
    val sunday = PrintWeather(18, 14, "Без осадков")

    sunday.printInfo()

    val monday = PrintWeather(25, 20, "Дождь днем")

    monday.printInfo()
}

class PrintWeather(val dayTimeTemp: Int, val dayNightTemp: Int, val dayRain: String) {

    fun printInfo() {
        println("Температура днем: $dayTimeTemp\nТемпература ночью: $dayNightTemp\nВозможность осадков: $dayRain")
    }
}
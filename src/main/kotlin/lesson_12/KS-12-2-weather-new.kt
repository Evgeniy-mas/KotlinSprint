package org.example.lesson_12


fun main() {
    val sunday = PrintWeather(18, 14, true)

    sunday.printInfo()

    val monday = PrintWeather(25, 20, false)

    monday.printInfo()
}

class PrintWeather(val dayTimeTemp: Int, val dayNightTemp: Int, val dayRain: Boolean) {

    fun printInfo() {
        println("Температура днем: $dayTimeTemp\nТемпература ночью: $dayNightTemp")

        if (dayRain) {
            println("Возможен дождь.")
        } else println("Осадки не ожидаются.")
    }
}
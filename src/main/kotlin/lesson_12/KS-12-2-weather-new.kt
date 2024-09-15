package org.example.lesson_12


fun main() {
    val sunday = PrintWeather(18, 14, true)

    sunday.printInfo()

    val monday = PrintWeather(25, 20, false)

    monday.printInfo()
}

class PrintWeather(val dayTimeTemp: Int, val dayNightTemp: Int, val isDayRain: Boolean) {

    fun printInfo() {
        println("Температура днем: $dayTimeTemp\nТемпература ночью: $dayNightTemp\n" +
                    "Наличие осадков:${if (isDayRain) "Да" else "Нет"}  "
        )
    }
}


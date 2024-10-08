package org.example.lesson_12

fun main() {
    val sunday = Weather()

    sunday.dayTimeTemp = 18
    sunday.dayNightTemp = 14
    sunday.dayRain = "Без осадков"

    sunday.printInfo()

    val monday = Weather()

    monday.dayTimeTemp = 25
    monday.dayNightTemp = 20
    monday.dayRain = "Дождь днем"

    monday.printInfo()
}

class Weather {
    var dayTimeTemp = 15
    var dayNightTemp = 10
    var dayRain = "Солнечная погода"

    fun printInfo() {
        println("Температура днем: $dayTimeTemp\nТемпература ночью: $dayNightTemp\nВозможность осадков: $dayRain")
    }
}
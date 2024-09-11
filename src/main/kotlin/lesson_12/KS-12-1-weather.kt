package org.example.lesson_12

fun main() {
    val sunday = NewClass()

    sunday.dayTimeTemp = "20"
    sunday.dayNightTemp = "15"
    sunday.dayRain = "Дождя нет"

    sunday.getInfo()

    sunday.seeInSky = "Луна"
    sunday.number = 55

    val monday = NewClass()

    monday.dayTimeTemp = "25"
    monday.dayNightTemp = "17"
    monday.dayRain = "Дождь днем"

    monday.getInfo()

    monday.seeInSky = "Облако"
    monday.number = 100
}

class NewClass {
    lateinit var dayTimeTemp: String
    lateinit var dayNightTemp: String
    lateinit var dayRain: String

    var seeInSky = "Солнце"
    var number = 45

    fun getInfo() {
        println("Температура днем: $dayTimeTemp\nТемпература ночью: $dayNightTemp\nПогода: $dayRain")
    }
}
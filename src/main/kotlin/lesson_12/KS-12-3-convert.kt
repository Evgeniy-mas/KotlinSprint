package org.example.lesson_12

fun main() {
    val sunday = PrintInfo(289, 281, true)

    sunday.printInfo()

    val monday = PrintInfo(299, 291, false)

    monday.printInfo()
}

class PrintInfo(_dayTimeTemp: Int, _dayNightTemp: Int, _isDayRain: Boolean) {
    var dayTimeTemp = _dayTimeTemp.toDouble()
        get() = field - 273.15

    val dayNightTemp = _dayNightTemp.toDouble()
        get() = field - 273.15

    val isDayRain = _isDayRain

    fun printInfo() {
        println(
            "Температура днем: ${String.format("%.0f", dayTimeTemp)}\n" +
                    "Температура ночью: ${String.format("%.0f", dayNightTemp)}\n" +
                    "Наличие осадков:${if (isDayRain) "Да" else "Нет"}  "
        )
    }
}
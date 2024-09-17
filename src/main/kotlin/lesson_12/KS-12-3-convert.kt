package org.example.lesson_12

fun main() {
    val sunday = WeatherInfo(289, 281, true)

    sunday.printInfo()

    val monday = WeatherInfo(299, 291, false)

    monday.printInfo()
}

class WeatherInfo(_dayTimeTemp: Int, _dayNightTemp: Int, _isDayRain: Boolean) {
    val dayTimeTemp = _dayTimeTemp.toDouble()
        get() = field - TEMP_CONVERT_KELVIN

    val dayNightTemp = _dayNightTemp.toDouble()
        get() = field - TEMP_CONVERT_KELVIN

    val isDayRain = _isDayRain

    fun printInfo() {
        println(
            "Температура днем: ${String.format("%.0f", dayTimeTemp)}\n" +
                    "Температура ночью: ${String.format("%.0f", dayNightTemp)}\n" +
                    "Наличие осадков:${if (isDayRain) "Да" else "Нет"}  "
        )
    }
}
const val TEMP_CONVERT_KELVIN = 273.15
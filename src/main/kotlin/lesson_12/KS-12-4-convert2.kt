package org.example.lesson_12

fun main() {
    val friday = WeatherInfo2(289, 281, true)

    val tuesday = WeatherInfo2(299, 291, false)
}

class WeatherInfo2(_dayTimeTemp: Int, _dayNightTemp: Int, _isDayRain: Boolean) {
    init {
        var dayTimeTemp = _dayTimeTemp.toDouble()
        dayTimeTemp -= TEMP_CONVERT_KELVIN2

        var dayNightTemp = _dayNightTemp.toDouble()
        dayNightTemp -= TEMP_CONVERT_KELVIN2

        val isDayRain = _isDayRain

        println(
            "Температура днем: ${String.format("%.0f", dayTimeTemp)}\n" +
                    "Температура ночью: ${String.format("%.0f", dayNightTemp)}\n" +
                    "Наличие осадков:${if (isDayRain) "Да" else "Нет"}  "
        )
    }
}

const val TEMP_CONVERT_KELVIN2 = 273.15
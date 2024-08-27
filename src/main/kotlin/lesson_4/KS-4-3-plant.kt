package org.example.lesson_4

fun main () {
    val weatherSun = true
    val tentIsOpen = true
    val humiDity = 20
    val season = "winter"

    val conditions = weatherSun == SUN_WEATHER &&
            tentIsOpen == OPEN_TENT &&
            humiDity == HUMIDITY &&
            season == SEASON_NEED

    println("Благоприятны ли условия сейчас для роста бобовых: $conditions")
}
const val SUN_WEATHER = true
const val OPEN_TENT = true
const val HUMIDITY = 20
const val SEASON_NEED = "not winter"
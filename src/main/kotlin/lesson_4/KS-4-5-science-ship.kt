package org.example.lesson_4

fun main() {
    val teamAlternative = 70
    val IsWeatherAlternative = true
    val provisionsAlternative = 50

    println("Введите наличие повреждения корпуса: true(Да) или false(Нет):")
    val damageShip = readln().toBoolean()

    println("Введите количество экипажа корабля")
    val crew = readln().toInt()

    println("Введите количество ящиков провизии")
    val boxProvisions = readln().toInt()

    println("Благоприятны ли метеоусловия: true(Да) или false(Нет)")
    val weatherConditions = readln().toBoolean()

    val result = (damageShip == IS_SHIP_DAMAGE) &&
            (crew >= TEAM_MIN) && (crew <= TEAM_MAX) &&
            (boxProvisions > PROVISIONS) &&
            (weatherConditions == IS_WEATHER) ||
            (damageShip != IS_SHIP_DAMAGE) && (crew == teamAlternative) &&
            (boxProvisions >= provisionsAlternative) &&
            (IsWeatherAlternative == IS_WEATHER)

    println("Корабль может приступить к плаванию: $result")
}
const val TEAM_MIN = 55
const val TEAM_MAX = 70
const val PROVISIONS = 50
const val IS_SHIP_DAMAGE = false
const val IS_WEATHER = true



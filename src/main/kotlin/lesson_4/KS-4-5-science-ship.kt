package org.example.lesson_4

fun main() {
    val team = 55..70
    val shipDamage: Boolean
    val provisions = 50
    val weather:Boolean

    val teamAlternative = 70
    val weather2 = true
    val provisions2 = 50

    println("Введите наличие повреждения корпуса: 1-да, 2-нет")
    val damageShip = readln()
    shipDamage = damageShip == "2"

    println("Введите количество экипажа корабля")
    val crew = readln().toInt()

    println("Введите количество ящиков провизии")
    val y = readln().toInt()

    println("Благоприятны ли метеоусловия: 1-Да, 2-Нет")
    val weatherConditions = readln()
    weather = weatherConditions == "1"

    val result = shipDamage && crew in team && y > provisions &&
            weather || !shipDamage && crew == teamAlternative &&
            y >= provisions2 && weather2

    println("Корабль может приступить к плаванию: $result")
}


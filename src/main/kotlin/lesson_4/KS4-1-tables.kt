package org.example.lesson_4

fun main() {
    val busyTableToday = 13
    val busyTableTomorrow = 9

    println("Доступность столиков на сегодня: ${busyTableToday < 13}\n" +
            "Доступность столиков на завтра: ${busyTableTomorrow < 13}")
}
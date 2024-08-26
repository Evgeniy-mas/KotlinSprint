package org.example.lesson_4

fun main() {
    val busyTableToday = TOTAL_TABLES
    val freeTableTomorrow = 4
    val busyTableTomorrow = TOTAL_TABLES - freeTableTomorrow

    println("Доступность столиков на сегодня: ${busyTableToday < TOTAL_TABLES}\n" +
            "Доступность столиков на завтра: ${busyTableTomorrow < TOTAL_TABLES}")
}
const val TOTAL_TABLES = 13
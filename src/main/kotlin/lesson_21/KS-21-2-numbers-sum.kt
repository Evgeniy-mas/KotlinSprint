package org.example.lesson_21

fun main() {
    val number = listOf(1, 5, 6, 12, 22, 9, 16, 3, 25, 2, 4, 24)

    number.evenNumbersSum()
}

fun List<Int>.evenNumbersSum() {

    println(this.filter { it % 2 == 0 }.sum())
}
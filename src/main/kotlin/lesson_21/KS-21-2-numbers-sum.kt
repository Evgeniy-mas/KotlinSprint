package org.example.lesson_21

fun main() {
    val number = listOf(1, 5, 6, 12, 22, 9, 16, 3, 25, 2, 4, 24)

    number.evenNumbersSum()
}

fun List<Int>.evenNumbersSum() {

    var count = 0

    forEach { i ->
        if (i % 2 == 0) {
            count += i
        }
    }
    println(count)
}
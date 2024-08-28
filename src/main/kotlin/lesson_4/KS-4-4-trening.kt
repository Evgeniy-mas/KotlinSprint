package org.example.lesson_4

fun main() {
    val day = 5
    val isEver:Boolean = day % 2 == 0

    println("Упражнения для рук: ${!isEver}")
    println("Упражнени для ног: ${isEver}")
    println("Упражнения для спины: ${isEver}")
    println("Упражнения для пресса: ${!isEver}")
}

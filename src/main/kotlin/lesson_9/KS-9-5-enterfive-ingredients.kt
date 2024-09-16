package org.example.lesson_9

fun main() {
    println("Введите пять ингредиентов по одному.")
    var number = 5

    val quantity = mutableSetOf<String>()

    while (number > 0) {
        println("Введите ингредиент:")

        val userEnter = readln()
        number--
        quantity.add(userEnter)
    }
    println(quantity.sorted().joinToString().capitalize())
}
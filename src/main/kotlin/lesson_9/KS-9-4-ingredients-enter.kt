package org.example.lesson_9

fun main() {
    println("Введите 5 ингредиентов, через запятую с пробелом:")

    val ingredients = readln().split(", ").toList()

    val newList = ingredients.sorted()

    println(newList.joinToString())
    println(newList[1])
}
package org.example.lesson_9

fun main() {
    println("Введите ингредиенты блюда, через запятую c пробелом:")

    val userEnter = readln().split(", ").toList()

    val newSortList = userEnter.sorted()

    println(newSortList)
}
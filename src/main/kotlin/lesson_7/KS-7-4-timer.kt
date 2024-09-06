package org.example.lesson_7

fun main() {
    println("Сколько секунд нужно засеч?")

    val userEnter = readln().toInt()

    for (i in userEnter downTo 1) {
        Thread.sleep(1000)
        println("Осталось секунд: $i")
    }
    println("Время вышло.")
}
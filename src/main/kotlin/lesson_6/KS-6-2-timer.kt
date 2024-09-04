package org.example.lesson_6

fun main() {

    println("Введите количество секунд, которые нужно засечь:")

    val timer = readln().toInt()
    var second = 0

    while (second < timer) {
        second++
        Thread.sleep(1000)
    }
    println("Прошло $timer секунд.")
}
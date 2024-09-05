package org.example.lesson_6

import java.util.concurrent.TimeUnit

fun main() {
    println("Введите количество секунд, которые нужно засечь:")

    val timer = readln().toLong()
    TimeUnit.SECONDS.sleep(timer)

    println("Прошло $timer секунд.")
}


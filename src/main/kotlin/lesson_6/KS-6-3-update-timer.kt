package org.example.lesson_6

fun main() {
    println("Введите количество секунд, которые нужно засечь:")

        val timer = readln().toInt()
        var timerIndication = timer
        var second = 0

        while (second < timer) {
            println("Осталось секунд: ${timerIndication--}")
            second++
            Thread.sleep(1000)
        }
        println("Время вышло.")
    }




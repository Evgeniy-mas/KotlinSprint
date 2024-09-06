package org.example.lesson_6

fun main () {
    val number = 6
    var userAttempt = 5

    while (userAttempt > 0) {

        println("Угадайте число от 1 до 9")

        val userChoice = readln().toInt()

        if (userChoice == number) {
            println("Это была великолепная игра!")
            break
        }

        else if(userAttempt !== 1)    {
            println("Неверно!")
            println("У вас осталось ${--userAttempt} попытки")
        }

        else {
            println("Было загадано число $number")
            break
        }
    }
}
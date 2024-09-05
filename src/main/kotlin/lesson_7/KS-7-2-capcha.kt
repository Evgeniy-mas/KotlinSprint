package org.example.lesson_7

fun main() {
    while(true) {

        val code = (1000..9999).random()
        println("Ваш код авторизации: $code")

        println("Введите код:")

        val userEnter = readln().toInt()

        if (userEnter == code) {
            println("Приветствую вас пользователь!")
            break

        } else println("Код введен неверно!")
    }
}

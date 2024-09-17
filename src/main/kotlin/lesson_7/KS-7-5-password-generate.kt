package org.example.lesson_7

fun main() {
    println("Какой длины пароль вы хотите сгенерировать?")
    println("Миниамльный пароль 6 символов:")

    var userChoice = readln().toInt()
    if (userChoice < MIN_PASSWORD) {
        userChoice = MIN_PASSWORD
    }

    val char = (0..9) + ('a'..'z') + ('A'..'Z')

    for (i in 1..userChoice) {
        val password = char.random().toString()
        print(password)
    }
}

const val MIN_PASSWORD = 6
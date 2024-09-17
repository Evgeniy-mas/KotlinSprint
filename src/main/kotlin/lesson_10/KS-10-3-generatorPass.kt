package org.example.lesson_10

fun main() {
    println("Какой длины пароль вы хотите сгенерировать?")

    val userChoice = readln().toInt()

    val password = generateRandomPassword(userChoice)
    println(password)
}

fun generateRandomPassword(len: Int): String {
    val char = ("0123456789") + ("!@#$%^&*()+,-./ ")

    return (1..len)
        .map { char.random() }
        .joinToString("")
}
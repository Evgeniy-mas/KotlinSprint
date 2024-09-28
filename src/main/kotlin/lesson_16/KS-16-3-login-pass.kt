package org.example.lesson_16

fun main() {
    val user = UserData("Evgeniy", "1234")

    println("Введите ваш пароль:")
    val enterPassword = readln()

    val result = user.checkPassword(enterPassword)
    println(result)
}

class UserData(val login: String, private val password: String) {

    fun checkPassword(pass: String): Boolean = pass == password
}
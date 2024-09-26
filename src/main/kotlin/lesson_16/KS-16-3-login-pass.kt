package org.example.lesson_16

fun main() {
    val user = UserData("Evgeniy", 1234)

    println("Введите ваш пароль:")
    val enterPassword = readln().toInt()

    val result = user.checkPassword(enterPassword)
    println(result)
}

class UserData(val login: String, private val password: Int) {

    fun checkPassword(pass: Int): Boolean = pass == password
}
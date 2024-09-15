package org.example.lesson_11

fun main() {
    val user = User2(11234, "Jack", 2024, "user1@yandex.ru")
    user.printUser()
    user.password(user.password)
    user.printUser()
    user.console()
    println(user.bio)
}

class User2(
    val id: Int,
    val login: String,
    var password: Int,
    val mail: String,
    var bio: String = "",
) {


    fun printUser() {
        println("id: $id\nlogin: $login\npassword: $password\nmail: $mail")

    }

    fun console() {
        val userEnter = readln()
        bio = userEnter
    }

    fun password(pass: Int) {
        println("Введите ваш пароль:")
        val checkPassword = readln().toInt()
        if (checkPassword == pass) {
            println("Придумайте новый пароль:")
            val newPassword = readln().toInt()
            password = newPassword
            println("Пароль изменен!")
        }
    }
}
package org.example.lesson_10

fun main() {
    println("Для регистрации в приложении придумайте логин и пароль:")
    println("Введите логин:")

    val login = readln()

    println("Введите пароль:")

    val password = readln()

    if (getCheck(login, password) ) {
        println("Вход выполнен!")
    } else {
        println("Пароль или логин недостаточно длинные.")
    }
}

fun getCheck(name: String, pass: String): Boolean = name.length >= MIN_PASSWORD && pass.length >= MIN_PASSWORD

const val MIN_PASSWORD = 4
package org.example.lesson_10

fun main() {
    println("Для регистрации в приложении придумайте логин и пароль:")
    println("Введите логин:")

    val login = readln()

    println("Введите пароль:")

    val password = readln()

    if (getCheck(login, password) == true) {
        println("Вход выполнен!")
    } else {
        println("Пароль или логин недостаточно длинные.")
    }
}

fun getCheck(name: String, pass: String): Boolean = name.length >= 4 && pass.length >= 4
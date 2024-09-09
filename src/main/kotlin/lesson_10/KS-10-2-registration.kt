package org.example.lesson_10

fun main() {
    println("Для регистрации в приложении придумайте логин и пароль:")
    println("Введите логин:")

    val login = readln()

    println("Введите пароль:")

    val password = readln()

    getCheck(login,password)
}

fun getCheck(name:String, pass:String) {
    val passwordMin = 4

    if (name.length < passwordMin || pass.length < passwordMin) {
        println("Логин или пароль недостаточно длинные!")
    }
    else println("Вход выполнен!")
}
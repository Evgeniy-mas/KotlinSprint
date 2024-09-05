package org.example.lesson_6

fun main() {
    println("Для входа,Вам нужно пройти регистрацию.")

    println("Придумайте логин:")
    val regLogin = readln()

    println("Придумайте пароль")
    val regPassword = readln().toInt()

    println("Вы зарегестрированны и можете войти используя свой логин и пароль")

    while (true) {
        println("Введите логин:")

        val userLogin = readln()

        println("Введите пароль")

        val userPassword = readln().toInt()

        if (userLogin == regLogin && userPassword == regPassword) {
            println("Авторизация прошла успешно")
            break
        }
        else {
            println("Вы ввели не правильный логин или пароль!")

        }
    }
}
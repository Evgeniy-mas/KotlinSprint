package org.example.lesson_6

fun main() {
    println("Для входа,Вам нужно пройти регистрацию.")

    println("Придумайте логин:")
    val regLogin = readln()

    println("Придумайте пароль:")
    val regPassword = readln().toInt()

    println("Вы зарегестрированны и можете войти используя свой логин и пароль.")

    while (true) {
        println("Введите логин:")

        val userLogin = readln()

        println("Введите пароль:")

        val userPassword = readln().toInt()

        if (userLogin == regLogin && userPassword == regPassword) {
            println("Авторизация прошла успешно")
            break
        }
        else {
            println("Вы ввели не правильный логин или пароль!")
        }
    }

    var attempts = 3
    while (attempts > 0) {

        val number = (1..9).random()
        val number2 = (1..9).random()

        println("Введите ответ на вопрос чтобы доказать, что вы не бот:")
        println("Сколько будет $number + $number2? ")

        val userAnswer = readln().toInt()

        if(userAnswer == number + number2) {
            println("Добро пожаловать!")
            break
        }
        else if(attempts !== 1) {
            println("Ответ не правильный!")
            --attempts
        }
        else {
            println("Доступ запрещен!")
            break
        }
    }
}
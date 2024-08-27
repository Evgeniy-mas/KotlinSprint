package org.example.lesson_5

fun main () {
    println("Вас приветствует андройд Марвин")
    println("Введите ваше имя пользователя:")

    if(readln() == LOGIN) {
        println("Введите ваш пароль:")}
    else {
        println("Пройдите пожалуйста регистрацию!")
        return
    }

    if(readln() == PASSWORD ) {
        println("Пользователь Zaphod, Вам разрешено входить на борт корабля Heart of Fold !")
    }
    else println("Введен не верный пароль")
    return
}
const val LOGIN = "Zaphod"
const val PASSWORD = "PanGalactic"
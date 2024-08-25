package org.example.lesson_5

fun main() {
    val firsNumber = 0..42
    val secondNumber = 0..42

    println("Угадайте два числа!")
    println("Введите первое число:")

    val first = readln().toInt()

    println("Введите второе число:")

    val second = readln().toInt()

    if (first in firsNumber && second in secondNumber) {
        println("Поздравляем! Вы выйграли главный приз!")
    }
    else if(first in firsNumber || second in secondNumber) {
        println("Вы выйграли утешительный приз!")
}
    else {
        println("Неудача!")
    }
    println("Для победы нужно было угадать два числа от 0 до 42!")
}

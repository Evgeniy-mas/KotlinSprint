package org.example.lesson_5

fun main() {
    val firsNumber = 25
    val secondNumber = 11

    println("Угадайте два числа от 0 до 42!")
    println("Введите первое число:")

    val first = readln().toInt()

    println("Введите второе число:")

    val second = readln().toInt()

    if (first == firsNumber && second == secondNumber || first == secondNumber && second == firsNumber) {
        println("Поздравляем! Вы выйграли главный приз!")
    }
    else if(first == firsNumber || first == secondNumber || second == secondNumber || second == firsNumber) {
        println("Вы выйграли утешительный приз!")
}
    else {
        println("Неудача!")
    }
    println("Для победы нужно было угадать два числа: $firsNumber и $secondNumber!")
}

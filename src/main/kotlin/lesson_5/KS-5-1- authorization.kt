package org.example.lesson_5

fun main() {
println("Для входа сложите два числа: 12 и 11")

    val number1 = 12
    val number2 = 11
    val result = number1 + number2

    val read = readln().toInt()
    if(read == result) {
        println("Добро пожаловать!")
    }
    else {
        println("Доступ запрещен")
    }
}

package org.example.lesson_5

fun main() {
println("Для входа сложите два числа: 12 и 11")

    val answer = 23

    val read = readln().toInt()
    if(read == answer) {
        println("Добро пожаловать!")
    }
    else {
        println("Доступ запрещен")
    }
}

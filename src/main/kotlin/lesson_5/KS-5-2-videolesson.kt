package org.example.lesson_5

fun main() {
    println("Для входа введите год рождения:")

    val yearOfBirth = readln().toInt()
    val userAge = 2024 - yearOfBirth

    if (userAge >= AGE_OF_MAJORITY) {
        println("Показать экран со скрытым контентом!")
}
    else {
        println("Доступ запрещен!")
    }
}
const val AGE_OF_MAJORITY = 18
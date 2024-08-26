package org.example.lesson_5

import java.util.Calendar

fun main() {
    println("Для входа введите год рождения:")
    val yearOfBirth = readln().toInt()

    val calendar = Calendar.getInstance()
    val yearNow = calendar.get(Calendar.YEAR)

    val userAge = yearNow - yearOfBirth

    if (userAge >= AGE_OF_MAJORITY) {
        println("Показать экран со скрытым контентом!")
}
    else {
        println("Доступ запрещен!")
    }
}
const val AGE_OF_MAJORITY = 18
package org.example.lesson_13

fun main() {
    val person = UserdataClass6("Jack", company = "Coca-cola")

    try {
        val enterNumber = readln().toLong()
        person.number = enterNumber
    } catch (e: Exception) {
        println("Ошибка - NumberFormatException!")
        println("Нужно вводить только цифры!")
    }
}

class UserdataClass6(val name: String, var number: Long? = null, val company: String?)



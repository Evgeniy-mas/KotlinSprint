package org.example.lesson_7

fun main() {
    println("Какой длины пароль вы хотите сгенерировать?")
    println("Миниамльный пароль 6 символов:")

    var userChoice = readln().toInt()
    if (userChoice < MIN_PASSWORD) {
        userChoice = MIN_PASSWORD
    }

    val listNumber = mutableListOf<String>()

    val char = ('a'..'z')
    val char2 = ('A'..'Z')
    val number = ('0'..'9')

    listNumber.add(char2.random().toString())
    listNumber.add(char.random().toString())
    listNumber.add(number.random().toString())

    val allChar = char + char2 + number

    var password = ""
    for (i in 1..userChoice - 3) {
        password = password + allChar.random().toString()
    }

    val result = listNumber + password
    println(result.shuffled().joinToString(""))
}

const val MIN_PASSWORD = 6
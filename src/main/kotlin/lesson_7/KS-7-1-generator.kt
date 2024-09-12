package org.example.lesson_7

fun main() {
    var password = ""

    for (i in 0..2) {
        val char = ('a'..'z').random()
        val number = (0..9).random()

        password = password + char + number
    }
    println(password)
}
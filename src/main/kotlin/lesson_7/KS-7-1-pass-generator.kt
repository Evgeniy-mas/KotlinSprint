package org.example.lesson_7

fun main() {
    var password = ""

    for (i in 1..3) {

        val char = ('a'..'z').random()
        val number = (0..9).random()

        password = password + number + char
    }
    println(password)
}
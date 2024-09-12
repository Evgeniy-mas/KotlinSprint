package org.example.lesson_7

fun main() {
    var passwordResult = ""

    for (i in 1..3) {

        val char = ('a'..'z').random().toString()
        val number = (0..9).random().toString()

        passwordResult = passwordResult + number + char
    }
    println(passwordResult)
}
package org.example.lesson_7

fun main() {
    val number = (0..9)
    val char = ('a'..'z')

    for (i in 0..2) {

        val password = char.random() + number.random().toString()
        print(password)
    }
}
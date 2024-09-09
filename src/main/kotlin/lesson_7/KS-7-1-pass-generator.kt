package org.example.lesson_7

fun main() {
    val char = ('a'..'z').toList()
    val randomChar = (1..3).map { char.random() }.joinToString("")

    val number = ("123456789").toList()
    val randomNumber = (1..3).map { number.random() }.joinToString("")

    println("${randomChar[0]}${randomNumber[0]}${randomChar[1]}" +
            "${randomNumber[1]}${randomChar[2]}${randomNumber[2]}")
}
package org.example.lesson_20

fun main() {
    val username = "Evgeniy"

    val splashScreen: () -> Unit = {
        println("С наступающим Новым Годом, $username!")
    }
    splashScreen()
}
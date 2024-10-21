package org.example.lesson_21

import java.io.File

fun main() {
    val file = File("How are you?")
    file.writeNewText("Hello")
    println(file)
}

fun File.writeNewText(text: String) {
    this.writeText(text)
}

fun File.lowercase(text: String) {

}
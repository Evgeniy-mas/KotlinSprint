package org.example.lesson_21

import java.io.File

fun main() {
    val file = File("text")
    file.createNewFile()

    file.writeNewText("How are you?")
    file.writeNewText("Hello!")
    println(file.readText())
}

fun File.writeNewText(text: String) {
    val newText = text.lowercase()
    val thisText = this.readText()
    this.writeText(newText + "\n" + thisText)
}
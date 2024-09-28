package org.example.lesson_21

fun main() {
    val word = "Hello World! It's a beautiful day today"

    word.vowelCount()
}

fun String.vowelCount() {
    var count = 0

    forEach { i ->
        when (i.lowercaseChar()) {
            'a', 'e', 'i', 'o', 'u', 'y' -> count++
        }
    }
    println(count)
}

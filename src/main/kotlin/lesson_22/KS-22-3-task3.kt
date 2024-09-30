package org.example.lesson_22

fun main() {
    val books = DataBook4("Гамлет", "Шекспир", "Литрес", 1000000)

    val (title, author, publish, edit) = books

    println(title)
    println(author)
    println(publish)
    println(edit)
}

data class DataBook4(val title: String, val author: String, val publishing: String, val circulation: Int)
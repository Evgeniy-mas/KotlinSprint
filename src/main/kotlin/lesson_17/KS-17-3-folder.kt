package org.example.lesson_17

fun main() {
    val file = Folder("Folder", 15, true)

    println(file.name)
}

class Folder(_name: String, val quantity: Int, val isSecret: Boolean) {

    var name = _name
        get() = if (isSecret) "Скрытая папка, количестов файлов - 0"
        else ("$field, количестово файлов - $quantity")
}
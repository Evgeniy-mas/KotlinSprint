package org.example.lesson_17

fun main() {
    val file = Folder("Folder", 15, true)

    println(file.name)
}

class Folder(_name: String, _quantity: Int, val isSecret: Boolean) {
    
    var name = _name
        get() = if (isSecret) "Скрытая папка, количестоа файлов - 0" else field

    val quantity = _quantity
        get() = if (isSecret) 0 else field
}
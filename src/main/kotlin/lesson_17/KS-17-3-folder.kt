package org.example.lesson_17

fun main() {
    val file = Folder("Folder", 15, true)

    println(file.name)
}

class Folder(_name: String, _file: Int, val isSecret: Boolean) {

    var name = _name
        get() = if (isSecret) "Скрытая папка, количество файлов - $file"
        else ("$field, количество файлов - $file")

    val file = _file
        get() = if (isSecret) 0 else field
}
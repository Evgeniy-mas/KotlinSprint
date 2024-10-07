package org.example.lesson_20

fun main() {
    var listWord = listOf("Привет", "Я робот", "Команды", "Поиск", "Деактивация")

    val lambda = { list: List<String> -> list.random().reversed() }

    say(listWord)

    val modify = setModifier(listWord, lambda)
    listWord = modify

    say(listWord)
}

fun setModifier(list: List<String>, modify: (List<String>) -> String): List<String> {
    val newList = modify(list)

    return listOf(newList)
}

fun say(list: List<String>) {

    println(list.random())
}
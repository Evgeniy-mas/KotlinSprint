package org.example.lesson_20

fun main() {
    val robotWord = Robot(listOf("Привет", "Я робот", "Команды", "Поиск", "Деактивация"))

    val lambda = { list: List<String> -> list.random().reversed() }

    robotWord.say()
    robotWord.setModifier(lambda)
    robotWord.say()
}

class Robot(private var word: List<String>) {

    fun setModifier(modify: (List<String>) -> String) {
        word = listOf(modify(word))
    }

    fun say() {
        println(word.random())
    }
}
package org.example.lesson_20

fun main() {
    val robotWord = Robot(listOf("Привет", "Я робот", "Команды", "Поиск", "Деактивация"))

    val lambda = { str: String -> str.reversed() }

    robotWord.say()
    robotWord.setModifier(lambda)
    robotWord.say()
}

class Robot(private var word: List<String>) {

    private var modifier: (String) -> String = { it }

    fun setModifier(modify: (String) -> String) {
        modifier = modify
    }

    fun say() {
        println(modifier.invoke(word.random()))
    }
}


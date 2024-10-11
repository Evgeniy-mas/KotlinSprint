package org.example.lesson_21

fun main() {
    val skill = mapOf("Рывок" to 450, "Огненный шар" to 220, "Кличь" to 150, "Щит молнии" to 450)

    skill.maxCategory()
}

fun Map<String, Int>.maxCategory() {
    val experience = this.values.max()

    val key = this.filter { it.value == experience }

    println(key.keys.random())
}
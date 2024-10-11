package org.example.lesson_21

fun main() {
    val skill = mapOf("Рывок" to 450, "Огненный шар" to 220, "Кличь" to 250, "Щит молнии" to 450)

    skill.maxCategory()
}


fun Map<String, Int>.maxCategory() {
    val maxExperience = this.values.max()

    val skill = this.filter { it.value == maxExperience }

    println(skill.keys.random())
}
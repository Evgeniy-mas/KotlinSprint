package org.example.lesson_21

fun main() {
    val skill = mapOf("Рывок" to 450, "Огненный шар" to 220, "Кличь" to 250, "Щит молнии" to 450)

    println(skill.maxCategory())
}

fun Map<String, Int>.maxCategory(): String {
    val maxExperience = this.values.max()

    return this.filter { it.value == maxExperience }.keys.random()
}

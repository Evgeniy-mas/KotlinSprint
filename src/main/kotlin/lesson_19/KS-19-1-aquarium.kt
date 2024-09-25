package org.example.lesson_19

fun main() {
    println("Вы можете добавть в аквариум таких рыбок как:" +
            "\n${Aquarium.entries.joinToString()}")
}

enum class Aquarium {
    GUPPY,
    ANGELFISH,
    GOLDFISH,
    `FIGHTING FISH`,
}
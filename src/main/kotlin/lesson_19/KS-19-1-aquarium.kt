package org.example.lesson_19

fun main() {
    println("Вы можете добавть в аквариум таких рыбок как:")

    for (i in Aquarium.entries) {
        println(i.nameFish)
    }
}

enum class Aquarium(val nameFish: String) {
    GUPPY("Гуппи"),
    ANGELFISH("Скалярия"),
    GOLDFISH("Золотая рыбка"),
    FIGHTING_FISH("Петушок")
}
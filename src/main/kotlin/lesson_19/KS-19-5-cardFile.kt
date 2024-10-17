package org.example.lesson_19

fun main() {
    val card = mutableListOf<Person3>()

    repeat(5) {
        println("Введите имя:")
        val name = readln().capitalize()

        println("Введите пол (М) или (Ж) ")
        val enterGender = readln().lowercase()


        val choiceGender = when (enterGender) {
            "м" -> Gender.MAN.id
            "ж" -> Gender.WOMEN.id
            else -> {
                "Неправильно введен пол!"
            }
        }
        card.add(Person3(name, choiceGender))
    }

    card.forEach { println("имя: ${it.name}\nпол: ${it.gender}") }
}

enum class Gender(val id: String) {
    MAN("мужской"),
    WOMEN("женский")
}

class Person3(val name: String, val gender: String)
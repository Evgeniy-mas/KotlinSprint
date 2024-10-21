package org.example.lesson_19

fun main() {
    val card = mutableListOf<Person3>()
    repeat(5) {
        println("Введите имя:")
        val name = readln().capitalize()

        var enterGender: String
        while (true) {
            println("Введите пол (М) или (Ж) ")
            enterGender = readln().lowercase()
            if (enterGender == "м" || enterGender == "ж") {
                break
            } else {
                println("Не правильно введен пол!")
            }
        }

        enterGender = if (enterGender == "м") {
            Gender.MAN.id
        } else Gender.WOMEN.id

        card.add(Person3(name, enterGender))

    }
    card.forEach { println("имя: ${it.name}\nпол: ${it.gender}") }
}

enum class Gender(val id: String) {
    MAN("мужской"),
    WOMEN("женский")
}

class Person3(val name: String, val gender: String)
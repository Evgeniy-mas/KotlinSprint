package org.example.lesson_14

fun main() {
    val liner = LinerShip()
    liner.property()
    println()

    val cargoship = CargoShip()
    cargoship.property()
    println()

    val icebreaker = IcebreakerShip()
    icebreaker.property()
    icebreaker.iceBreaker()
}

open class LinerShip {
    open val speed = 50
    open val tonnage = 50
    open val passengers = 100

    fun property() {
        println("Скорость корабля: $speed\nГрузоподъемность: $tonnage\nВместимость: $passengers")
    }
}

class CargoShip : LinerShip() {
    override val speed = 25
    override val tonnage = 100
    override val passengers = 20
}

class IcebreakerShip : LinerShip() {
    override val speed = 30
    override val tonnage = 30
    override val passengers = 40

    fun iceBreaker() {
        println("Возможность колоть лёд.")
    }
}
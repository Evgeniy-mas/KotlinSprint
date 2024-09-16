package org.example.lesson_14

fun main() {
    val liner = LinerShip2()
    liner.property()
    liner.loading()
    println()

    val cargoship = CargoShip2()
    cargoship.property()
    cargoship.loading()
    println()

    val icebreaker = IcebreakerShip2()
    icebreaker.property()
    icebreaker.iceBreaker()
    icebreaker.loading()
}

open class LinerShip2 {
    open val speed = 50
    open val tonnage = 50
    open val passengers = 100

    fun property() {
        println("Скорость корабля: $speed\nГрузоподъемность: $tonnage\nВместимость: $passengers")
    }

    open fun loading() {
        println("Выдвенуть горизонтальный трап со шкафута.")
    }
}

class CargoShip2 : LinerShip2() {
    override val speed = 25
    override val tonnage = 100
    override val passengers = 20

    override fun loading() {
        println("Активировать погрузочный кран")
    }
}

class IcebreakerShip2 : LinerShip2() {
    override val speed = 30
    override val tonnage = 30
    override val passengers = 40

    fun iceBreaker() {
        println("Возможность колоть лёд.")
    }

    override fun loading() {
        println("Открыть ворота со стороны кормы.")
    }
}
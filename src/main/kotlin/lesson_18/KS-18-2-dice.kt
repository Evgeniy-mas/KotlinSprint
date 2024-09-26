package org.example.lesson_18

fun main() {
    val cube = Dice()

    val cube2: Dice = Dice2()

    val cube3: Dice = Dice3()

    val listCube: List<Dice> = listOf(cube, cube2, cube3)

    listCube.forEach {
        println("Выпало значение: ${it.rollDice1()}")
    }
}

open class Dice {
    open val edge = (1..4)

    open fun rollDice1(): Int = edge.random()
}

class Dice2: Dice() {
    override val edge = (1..6)

    override fun rollDice1(): Int = edge.random()
}

class Dice3: Dice() {
    override val edge = (1..8)

    override fun rollDice1(): Int = edge.random()
}
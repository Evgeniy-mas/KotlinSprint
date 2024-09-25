package org.example.lesson_18

fun main() {
    val cube = Dice(1..4)

    val cube2: Dice = Dice2(1..6)

    val cube3: Dice = Dice3(1..8)

    val listCube: List<Dice> = listOf(cube, cube2, cube3)

    listCube.forEach {
        println("Выпало значение: ${it.rollDice1()}")
    }
}

open class Dice(val edge: IntRange) {

    open fun rollDice1(): Int = edge.random()
}


class Dice2(edge: IntRange) : Dice(edge) {

    override fun rollDice1(): Int = edge.random()
}

class Dice3(edge: IntRange) : Dice(edge) {

    override fun rollDice1(): Int = edge.random()
}
package org.example.lesson_16

fun main() {
    val cube = GameCube()

    println(cube.getNumberCube())
}

class GameCube {
    private val number = 5

    fun getNumberCube() = number
}
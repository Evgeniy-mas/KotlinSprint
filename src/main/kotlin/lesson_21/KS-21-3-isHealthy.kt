package org.example.lesson_21

fun main() {
    val gamer = Gamer4("Gamer", 115, 200)

    println(gamer.isHealthy())
}

class Gamer4(val name: String, var currentHealth: Int, val maxHealth: Int)

fun Gamer4.isHealthy(): Boolean = this.currentHealth == this.maxHealth
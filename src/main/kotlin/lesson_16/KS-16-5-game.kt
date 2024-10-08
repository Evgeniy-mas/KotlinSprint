package org.example.lesson_16

import kotlin.system.exitProcess

fun main() {
    val gamer = Gamer5("Nick", 180, 25)

    gamer.damage(30)
    gamer.damage(40)
    gamer.damage(50)
    gamer.damage(30)
    gamer.damage(40)
    gamer.damage(50)
    gamer.damage(30)
}

class Gamer5(val name: String, var health: Int, var powerHit: Int) {

    fun damage(damage: Int) {
        health -= damage

        if (health <= 0) {
            health = 0
            powerHit = 0
            println("Игрок $name умер, здоровье - $health, сила удара - $powerHit ")
            exitProcess(0)

        } else if (health < HEALTH_HEALING) {
            healing()
        }
        println("Здоровье игрока $health")
    }

    private fun healing() {

        health += 20
    }
}

const val HEALTH_HEALING = 50

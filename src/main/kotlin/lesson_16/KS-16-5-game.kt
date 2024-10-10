package org.example.lesson_16

fun main() {
    val gamer = Gamer5("Nick", 100, 25)

    gamer.damage(20)
    gamer.damage(15)
    gamer.damage(25)
    gamer.healing()
    gamer.damage(20)
    gamer.damage(15)
    gamer.healing()
    gamer.damage(45)
}

class Gamer5(val name: String, private var health: Int, private var powerHit: Int) {

    fun damage(damage: Int) {
        health -= damage
        println("Игрок $name получил урон $damage, осталось здоровья $health")
        if (health == 0) {
            gamerDie()
        }
    }

    fun healing() {
        if (health <= HEALTH_HEALING) {
            health += 20
        }
        else println("Невозможно использовать.")
    }

    private fun gamerDie() {
        powerHit = 0
        println("Игрок умер, здоровье $health, сила удара $powerHit")
    }
}

const val HEALTH_HEALING = 50

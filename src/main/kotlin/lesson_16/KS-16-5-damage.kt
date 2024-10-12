package org.example.lesson_16

fun main() {
    val gamer = NewGamer6("Jey", 100, 25)

    gamer.damage(20)
    gamer.damage(15)
    gamer.damage(25)
    gamer.healing()
    gamer.damage(20)
    gamer.damage(15)
    gamer.healing()
    gamer.damage(47)
    gamer.damage(50)
}

class NewGamer6(
    val name: String,
    private var health: Int,
    private var powerHit: Int,
    private var isAlive: Boolean = true
) {

    fun damage(damage: Int) {
        if (!isAlive) {
            println("Игрок умер, нельзя нанести урон!")
            return
        }

        health -= damage
        println("Игрок $name получил урон $damage")
        if (health <= 0) {
            gamerDie()
        }
    }

    fun healing() {
        if (health <= HEALTH_HEALING_MIN) {
            health += 20
        } else println("Невозможно использовать.")
    }

    private fun gamerDie() {
        isAlive = false
        powerHit = 0
        health = 0
        println("Игрок умер, здоровье $health, сила удара $powerHit")
    }
}

const val HEALTH_HEALING_MIN = 50
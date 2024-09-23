package org.example.lesson_20

fun main() {

    val gamer = Gamer("Gamer", 115, 200)

    gamer.currentHealth = (gamer.getHealth(gamer.maxHealth, gamer.currentHealth))

    println("Здоровье игорока ${gamer.name} после лечебного зелья равно: ${gamer.currentHealth}")
}

class Gamer(val name: String, var currentHealth: Int, val maxHealth: Int) {

    val getHealth: (Int, Int) -> Int = { max: Int, current: Int -> (max - current) + currentHealth }

}
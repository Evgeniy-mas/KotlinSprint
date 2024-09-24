package org.example.lesson_20

fun main() {
    val player = Gamer2()

    val getKey: (x: Boolean) -> String = { if (player.isHasKey) "Игрок открыл дверь!" else "Дверь заперта!" }
    println(getKey(player.isHasKey))
}

class Gamer2 {

    val isHasKey = true
}
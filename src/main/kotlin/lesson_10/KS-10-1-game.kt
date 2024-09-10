package org.example.lesson_10

fun main() {
    println("Игрок делает свой ход:")

    val gamer = rollDice()
    println("Результат игрока: $gamer")

    println("Компьютер делает свой ход:")

    val computer = rollDice()
    println("Результат машины: $computer")

    if (gamer > computer) {
        println("Победило человечество!")
    } else if (gamer < computer) println("Победила машина!")
    else println("Ничья!")
}

fun rollDice(): Int = (1..6).random()





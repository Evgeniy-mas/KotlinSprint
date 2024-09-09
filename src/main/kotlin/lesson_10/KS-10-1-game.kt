package org.example.lesson_10

fun main() {
    println("Игрок делает свой ход:")

    val gamer = getMove()
    println("Результат игрока: $gamer")

    println("Компьютер делает свой ход:")

    val computer = getMove()
    println("Результат машины: $computer")

    if (gamer > computer) {
        println("Победило человечество!")
    }

    else if(gamer < computer) println("Победила машина!")
    else println("Ничья!")
}

fun getMove():Int {

    val random = (1..6).random()

    return random
}
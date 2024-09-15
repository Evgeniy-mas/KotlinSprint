package org.example.lesson_10

fun main() {
    var counter = 0

    while (true) {
        println("Игрок делает свой ход:")

        val gamer = rollDice()
        println("Результат игрока: $gamer")

        println("Машина делает свой ход:")
        val computer = rollDice()
        println("Результат машины: $computer")

        if (gamer > computer) {
            println("Победило человечество!")
            counter++
        } else if (gamer < computer) {
            println("Победила машина!")
        } else println("Ничья!")

        println("Хотите бросить кости еще раз? Введите Да или Нет:")

        val question = nextMove(readln().lowercase())

        if (!question) {
            break
        }
    }
    println("Количество побед: $counter")
}

fun rollDiceNew(): Int = (1..6).random()

fun nextMove(answer: String): Boolean = answer == "да"



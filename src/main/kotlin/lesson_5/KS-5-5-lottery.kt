package org.example.lesson_5

fun main() {
    println("Угадайте три числа от 0 до 42")
    val random = (0..42).random()
    val random2 = (0..42).random()
    val random3 = (0..42).random()

    val allRandom = listOf(random,random2,random3)

    val userChoice = mutableListOf<Int>()

    println("Введите первое число")
    userChoice.add(readln().toInt())

    println("Введите второе число")
    userChoice.add(readln().toInt())

    println("Введите третье число")
    userChoice.add(readln().toInt())

    val intersect = allRandom.intersect(userChoice).size

    when(intersect) {
        3 -> println("Вы угадали все числа и выйграли Джекпот!")
        2 -> println("Вы угадали 2 числа и выйграли крупный приз!")
        1 -> println("Вы получаете утешительный приз!")
        else -> println("Вы не угадали ни одного числа")
    }
    println("Выигрышные числа: ${allRandom[0]},${allRandom[1]},${allRandom[2]}  ")
}
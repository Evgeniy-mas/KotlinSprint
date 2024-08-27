package org.example.lesson_5

fun main() {
    println("Угадайте три числа от 0 до 42")

    val random = listOf((0..42).random())
    println("Введите первое число")
    val firstNumber = listOf(readln().toInt())

    val random2 = listOf((0..42).random())
    println("Введите второе число")
    val secondNumber = listOf(readln().toInt())

    val random3 = listOf((0..42).random())
    println("Введите третье число")
    val thirdNumber = listOf(readln().toInt())

    val check = random.intersect(firstNumber).size
    val check2 = random2.intersect(secondNumber).size
    val check3 = random3.intersect((thirdNumber)).size

    when {
        check and check2 and check3 == 1 -> println("Вы выйрали джекпот!")
        check and check2 == 1 || check2 and check3 == 1 || check and check3 == 1 -> println("Вы выиграли крупный приз")
        check == 1 || check2 == 1 || check3 == 1 -> println("Вы получаете утешительный приз")
        else -> println("Вы не угадали ни одного числа")
    }
    println("Выигрышные числа: ${random[0]},${random2[0]},${random3[0]}")
}

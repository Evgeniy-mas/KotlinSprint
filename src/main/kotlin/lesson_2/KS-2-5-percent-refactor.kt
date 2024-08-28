package org.example.lesson_2

import kotlin.math.pow

fun main() {
    val startDeposit = 70000
    val bet = 16.7
    val year = 20
    val numberConvertBet = 100
    val numberConvertOne = 1

    val endDeposit = startDeposit * (numberConvertOne + bet / numberConvertBet).pow(year)

    println("Доход за 20 лет: ${String.format("%.3f",endDeposit)}")
}

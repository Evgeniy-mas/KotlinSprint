package org.example.variables_lesson

import kotlin.math.pow

fun main() {
    val endDeposit = START_DEPOSIT * (CONVERT_BET + BET / NUMBER_CONVERT_BET).pow(YEAR)

    println("Доход за 20 лет ${String.format("%.3f",endDeposit)}")
}
const val START_DEPOSIT = 70000
const val BET = 16.7
const val YEAR = 20
const val NUMBER_CONVERT_BET = 100
const val CONVERT_BET = 1


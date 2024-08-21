package org.example.lesson_2

fun main() {
    val constWorkerExpenses = 50 * 30000
    val newExpenses = 30 * 20000 + constWorkerExpenses
    val averageSalary = newExpenses / 80

    println(constWorkerExpenses)
    println(newExpenses)
    println(averageSalary)
}
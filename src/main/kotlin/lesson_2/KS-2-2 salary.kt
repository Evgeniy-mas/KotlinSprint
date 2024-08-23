package org.example.lesson_2

fun main() {
    val constWorker = 50
    val salaryConstWorker = 30000

    val newWorker = 30
    val salaryNewWorker = 20000

    val constWorkerExpenses = constWorker * salaryConstWorker
    val newExpenses = newWorker * salaryNewWorker + constWorkerExpenses
    val allWorker = constWorker + newWorker
    val averageSalary = newExpenses / allWorker

    println(constWorkerExpenses)
    println(newExpenses)
    println(averageSalary)
}
package org.example.lesson_4

fun main() {
    val dayWorkout = 7
    val parityNumber = dayWorkout % 2
    println("Упражнения для рук: ${HAND_AND_PRESS == parityNumber}\n" +
            "Упражнения для ног: ${LEGS_AND_BACK == parityNumber}\n" +
            "Упражнения для спины: ${LEGS_AND_BACK == parityNumber}\n" +
            "Упражнения для пресса: ${HAND_AND_PRESS == parityNumber}\n")
}
const val HAND_AND_PRESS = 1
const val LEGS_AND_BACK = 0
package org.example.lesson_2

fun main() {
    val hourStartTrain = 9
    val minuteStartTrain = 39
    val travelTimeMinute = 457

    val convertTimeStart = hourStartTrain * CONST_ONE_MINUTE + minuteStartTrain
    val timeArriveInMinute = convertTimeStart + travelTimeMinute

    val hourArrive = timeArriveInMinute / CONST_ONE_MINUTE
    val minuteArrive = timeArriveInMinute % CONST_ONE_MINUTE

    val hour = String.format("%02d", hourArrive)
    val minute = String.format("%02d",  minuteArrive)

    println("Время прибытия поезда в: $hour:$minute")
}
const val CONST_ONE_MINUTE = 60


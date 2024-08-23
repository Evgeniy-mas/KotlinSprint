package org.example.lesson_2

fun main() {
    val hourStartTrain = 9
    val minuteStartTrain = 39
    val travelTimeMinute = 457

    val convertTimeStart = hourStartTrain * 60 + minuteStartTrain
    val timeArriveInMinute = convertTimeStart + travelTimeMinute

    val hourArrive = timeArriveInMinute / 60
    val minuteArrive = timeArriveInMinute - hourArrive * 60

    println("Время прибытия поезда в: $hourArrive:$minuteArrive")
}

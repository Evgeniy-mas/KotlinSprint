package org.example.lesson_2

fun main() {
    val hourStartTrain = 9
    val minuteStartTrain = 39
    val travelTimeMinute = 457
    val constOneMinute = 60

    val convertTimeStart = hourStartTrain * constOneMinute + minuteStartTrain
    val timeArriveInMinute = convertTimeStart + travelTimeMinute

    val hourArrive = timeArriveInMinute / constOneMinute
    val minuteArrive = timeArriveInMinute % constOneMinute

    val hour = String.format("%02d", hourArrive)
    val minute = String.format("%02d",  minuteArrive)

    println("Время прибытия поезда в: $hour:$minute")
}

package org.example.variables_lesson

fun main() {
    val second = 6480
    val secInMinute = 60
    val secInHour = 3600

    val hours = second / secInHour

    val minutes = (second % secInHour) / secInMinute

    val seconds = second % secInMinute

    println("Время в космосе: %02d:%02d:%02d".format(hours, minutes, seconds))
}

package org.example.variables_lesson

fun main() {
    val hour = SECOND / SEC_IN_HOUR

    val minute = (SECOND % SEC_IN_HOUR) / SEC_IN_MINUTE

    val second = SECOND % SEC_IN_MINUTE

    println("Время в космосе: ${String.format("%02d",hour )}:$minute:${String.format("%02d",second)}")
}
const val SECOND =  6480
const val SEC_IN_MINUTE = 60
const val SEC_IN_HOUR = 3600
package org.example.lesson_4

fun main() {
    val cargoWeight = 20
    val cargoVolume = 80

    val cargoWeight2 = 50
    val cargoVolume2 = 100

    println("${(cargoWeight > AVERAGE_WEIGHT_MIN) &&
            (cargoWeight <= AVERAGE_WEIGHT_MAX) &&
            (cargoVolume < AVERAGE_VOLUME)}")

    println("${(cargoWeight2 > AVERAGE_WEIGHT_MIN) &&
            (cargoWeight2 <= AVERAGE_WEIGHT_MAX) &&
            (cargoVolume2 < AVERAGE_VOLUME)}")
}
const val AVERAGE_WEIGHT_MIN = 35
const val AVERAGE_WEIGHT_MAX = 100
const val AVERAGE_VOLUME = 100
package org.example.lesson_4

fun main() {
    val averageWeightMin = 35
    val averageWeightMax = 100
    val averageVolume = 100

    val cargoWeight = 20
    val cargoVolume = 80

    val cargoWeight2 = 50
    val cargoVolume2 = 100

    println("${(cargoWeight > averageWeightMin) &&
            (cargoWeight <= averageWeightMax) 
           && (cargoVolume < averageVolume)}")

    println("${(cargoWeight2 > averageWeightMin) &&
            (cargoWeight2 <= averageWeightMax)
            && (cargoVolume2 < averageVolume)}")
}
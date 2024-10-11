package org.example.lesson_22

fun main() {
    val alphaCentauri = GalacticGuide(
        "Альфа-центавра",
        "Тройная звездная система в южном созвездии Центавра",
        "1915", 4.22
    )

    val title = alphaCentauri.component1()
    println("Созвездие $title")

    val description = alphaCentauri.component2()
    println(description)

    val data = alphaCentauri.component3()
    println("Дата открытия: - $data год")

    val distance = alphaCentauri.component4()
    println("Расстояние от земли: $distance световых года")
}

data class GalacticGuide(
    val title: String,
    val description: String,
    val data: String, val distance: Double
)
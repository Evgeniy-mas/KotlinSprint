package org.example.lesson_15

fun main() {
    val guitar = Instrument("Гитара", 70)
    val piano = Instrument("Пианино", 15)

    val accessory = Accessories("Струны", 30)
    val accessory2 = Accessories("Клавиши", 100)

    guitar.searchAccessory()
    accessory.showAccessory()

    piano.searchAccessory()
    accessory2.showAccessory()
}

class Instrument(val title: String, val quantity: Int) : SearchAccessory {

    override fun searchAccessory() {
        println("Выполняется поиск комплектующих для $title...")
    }
}

class Accessories(val title: String, val quantity: Int) {

    fun showAccessory() {
        println("Найдены комплектующие $title, количество $quantity")
    }
}

interface SearchAccessory {

    fun searchAccessory()
}
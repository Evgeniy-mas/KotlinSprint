package org.example.lesson_15

fun main() {
    val guitar = Instrument("Инструменты", "Гитара", 70)
    val piano = Instrument("Инструменты", "Пианино", 15)

    val accessory = Accessories("Комплектующие", "Струны", 30)
    val accessory2 = Accessories("Комплектующие", "Клавиши", 100)

    guitar.searchAccessory()
    accessory.showAccessory()
    println()

    piano.searchAccessory()
    accessory2.showAccessory()
}

open class MusicStore(val category: String, val title: String, val quantity: Int)

class Instrument(category: String, title: String, quantity: Int) : MusicStore(category, title, quantity),
    SearchAccessory {

    override fun searchAccessory() {
        println("Категория: $category")
        println("Выполняется поиск комплектующих для $title...")
    }
}

class Accessories(category: String, title: String, quantity: Int) : MusicStore(category, title, quantity) {

    fun showAccessory() {
        println("Найдены комплектующие $title, количество $quantity")
    }
}

interface SearchAccessory {

    fun searchAccessory()
}
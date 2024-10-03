package org.example.lesson_19

fun main() {
    val hat = Products("Шляпа", 101, Category.CLOTHES)
    val notepad = Products("Блокнот", 102, Category.STATIONERY)
    val umbrella = Products("Зонт", 103, Category.OTHER)

    umbrella.showProductsInfo()
    umbrella.showCategories()

    hat.showProductsInfo()
    hat.showCategories()

    notepad.showProductsInfo()
    hat.showCategories()
}

enum class Category(val title: String) {

    CLOTHES("Одежда"),
    STATIONERY("Канцелярские товары"),
    OTHER("Разное");

    fun getCategories(): String = title
}

class Products(val title: String, val id: Int, val category: Category) {

    fun showProductsInfo() {
        print("Товар $title, id товара: $id.")

    }

    fun showCategories() {
        println(" Категория: ${category.getCategories()}")
    }
}
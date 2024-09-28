package org.example.lesson_20

fun main() {
    var list = listOf("Рецепты", "Обеды", "Завтраки", "Ужины", "Ланчи", "Доставка")

    list = list.filterIndexed { index, _ -> index % 2 == 0 }

    list.map { item -> println("Нажат элемент: $item") }
}
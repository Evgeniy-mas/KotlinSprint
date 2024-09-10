package org.example.lesson_9

fun main() {
    println("В рецепте есть следующие ингредиенты:")

    val ingredients = listOf("лапша", "курица", "соус", "кунжут", "масло")

    ingredients.forEach { println(it) }
}
package org.example.lesson_8

fun main() {
    val ingredients = arrayOf("картошка", "лук", "свекла", "уксус")

    println("Какой ингредиент вы хотите найти?")

    val search = readln()

    if (search in ingredients) {
        println("Ингредиент в рецепте есть.")
        return
    }

    else {
        println("Такого ингредиента в рецепте нет.")
    }
}
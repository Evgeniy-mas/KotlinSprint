package org.example.lesson_8

fun main() {
    val saladRecipe = arrayOf("Картофель", "Яйцо", "Огурец", "Морковь", "Горох", "Майонез")

    println("Какой ингредиент в рецепте вы хотите найти?")

    val search = readln()

    for(i in saladRecipe) {
        if (i == search) {
            println("Ингредиент в рецепте есть.")
            return
        }
    }
    println("Такого ингредиента в рецепте нет.")
}

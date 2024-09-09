package org.example.lesson_9

fun main() {
    val ingredients = mutableListOf("картофель","лук","грибы")

    println("В рецепте есть базовые ингредиенты:")
    println(ingredients)

    println("Желаете добавить ещё?")

    val question = readln()

    if(question == "нет") {
        return
    }
    else if(question == "да") {
        println("Какой ингредиент вы хотите добавить?")
    }

    val addIngredients = readln()
    ingredients.add(addIngredients)

    println("Теперь в рецепте есть следующие ингредиенты: $ingredients")
}
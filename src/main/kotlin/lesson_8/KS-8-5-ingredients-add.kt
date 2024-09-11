package org.example.lesson_8

fun main() {
    println("Сколько ингредиентов вы хотите добавить?")

    var userChoice = readln().toInt()

    var ingredients = arrayOf<String>()

    println("Введите ингредиент:")

    while (userChoice > 0) {

        val addIngredients = readln()
        ingredients += addIngredients

        userChoice--
        if (userChoice == 0) {
            break
        }
        println("Введите следующий ингредиент:")
    }
    println(ingredients.joinToString(","))
}

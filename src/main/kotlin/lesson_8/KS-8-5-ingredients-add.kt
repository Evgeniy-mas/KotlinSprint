package org.example.lesson_8

fun main() {
    println("Сколько ингредиентов вы хотите добавить?")

    var userChoice = readln().toInt()

    val ingredients = arrayOfNulls<String>(userChoice)

    while (userChoice > 0) {
        for (i in ingredients.indices) {
            println("Введите ингредиент:")

            val addIngredients = readln()

            ingredients[i] = addIngredients

            userChoice--
        }

        userChoice--
        if (userChoice == 0) {
            break
        }
    }
    println(ingredients.joinToString(","))
}

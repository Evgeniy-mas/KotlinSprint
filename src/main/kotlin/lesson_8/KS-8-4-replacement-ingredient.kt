package org.example.lesson_8

fun main() {
    println("Список ингредиентов в блюде:")

    val ingredients = arrayOf("укроп", "огурец", "колбаса", "горох")
    println(ingredients.joinToString(","))

    println("Какой ингердиент вы хотите заменить?")

    val userReplacement = readln()

    if(userReplacement in ingredients) {
        println("Какой ингредиент вы хотите добавить?")
    }
    else{
        println("Такого ингредиента нет.")
        return
    }

    val addIngredient = readln()

    ingredients.set(ingredients.indexOf(userReplacement), addIngredient)

    println("Готово! Вы сохранили следующий список: ${ingredients.joinToString (",")}.")
}
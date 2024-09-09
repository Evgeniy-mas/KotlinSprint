package org.example.lesson_9

fun main() {
    println("Какое количество порций омлета вы хотите приготовить?")

    val ingredients = mutableListOf(2, 50, 15)

    val question = readln().toInt()

    val quantity = ingredients.map { it * question }

    println("На $question порции вам понадобится:")
    println("яиц - ${quantity[0]}шт, молока - ${quantity[1]}мл, сливочного масла - ${quantity[2]}гр. ")
}
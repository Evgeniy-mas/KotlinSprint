package org.example.lesson_18

fun main() {
    val fox = Fox("Foxy")
    val dog = Dog("Max")
    val cat = Cat("Kelly")

    val animals: List<Fox> = listOf(fox, dog, cat)
    animals.forEach { it.getFood() }
}

open class Fox(val name: String) {

    open fun getFood() {
        println("$name ест ягоды.")
    }
}

class Dog(name: String) : Fox(name) {

    override fun getFood() {
        println("$name грызет кости.")
    }
}

class Cat(name: String) : Fox(name) {

    override fun getFood() {
        println("$name ест рыбу.")
    }
}
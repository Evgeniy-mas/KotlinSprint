package org.example.lesson_18

fun main() {
    val fox = Fox("Foxy")
    val dog = Dog("Max")
    val cat = Cat("Kelly")

    val animals: List<Animal> = listOf(fox, dog, cat)
    animals.forEach { it.getFood() }
}

abstract class Animal(val name: String) {
    abstract fun getFood()
}

class Fox(name: String) : Animal(name) {

    override fun getFood() {
        println("$name ест ягоды.")
    }
}

class Dog(name: String) : Animal(name) {

    override fun getFood() {
        println("$name грызет кости.")
    }
}

class Cat(name: String) : Animal(name) {

    override fun getFood() {
        println("$name ест рыбу.")
    }
}
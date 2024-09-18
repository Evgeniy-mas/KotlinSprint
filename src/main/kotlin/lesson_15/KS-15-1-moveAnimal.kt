package org.example.lesson_15

fun main() {
    val carp = Carp()
    carp.swim()
    println()

    val duck = Duck()
    duck.walk()
    duck.swim()
    duck.fly()
    println()

    val seagull = SeaGull()
    seagull.walk()
    seagull.fly()
}

interface MovableSwim {
    fun swim()
}

interface MovableFly {
    fun fly()
}

interface MovableWalk {
    fun walk()
}

class Carp : MovableSwim {
    override fun swim() {
        println("Карась плавает под водой.")
    }
}

class Duck : MovableWalk,MovableSwim,MovableFly {
    override fun walk() {
        println("Утка умеет ходить.")
    }

    override fun swim() {
        println("Утка умеет плавать.")
    }

    override fun fly() {
        println("Утка летает.")
    }
}

class SeaGull : MovableWalk,MovableFly {
    override fun walk() {
        println("Чайка умеет ходить.")
    }

    override fun fly() {
        println("Чайка летает.")
    }
}
package org.example.lesson_15

fun main() {
    val carp = Carp()
    carp.moveCarp()

    val duck = Duck()
    duck.moveDuck()

    val seagull = SeaGull()
    seagull.moveSeaGull()
}

interface MovableFish {
    fun moveCarp()
}

interface MovableBird {
    fun moveSeaGull()
}

interface MovableDuck {
    fun moveDuck()
}

class Carp : MovableFish {
    override fun moveCarp() {
        println("Карась плавает под водой.")
    }
}

class Duck : MovableDuck {
    override fun moveDuck() {
        println("Утка летает и плавает по воде.")
    }
}

class SeaGull : MovableBird {
    override fun moveSeaGull() {
        println("Чайка летает.")
    }
}
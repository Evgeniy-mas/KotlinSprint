package org.example.lesson_19

fun main() {
    val ship = SpaceShip3("Энтерпрайз")

    ship.takeOff()
    ship.boarding()
    ship.shooting()
}

class SpaceShip3(private val title:String) {

    fun takeOff() {
        println("Космический корабль $title начинает взлет.")
        //TODO добавить запус варп двигателей
        //TODO указать готовноость экипажа
    }

    fun boarding() {
        println("Космический корабль $title совершает посадку.")
    }

    fun shooting() {
        TODO("Реализовать возможность корабля, отстреливаться от астеройдов")
    }
}
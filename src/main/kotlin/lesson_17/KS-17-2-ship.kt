package org.example.lesson_17

fun main() {
    val ship = Ship("Виктория", 20, "Лагуна")
    ship.name = "Титаник"
}

class Ship(_name: String, val speed: Int, val port: String) {
    var name = _name
        set(value) {
            if (value !== "Виктория")
                println("Вы не можете поменять имя корабля!")
        }
}
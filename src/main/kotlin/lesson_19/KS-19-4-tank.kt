package org.example.lesson_19

fun main() {
    val tank34 = Tank("Т-34", null)
    tank34.loadingMissile(Ammunition.BLUE.id)
    tank34.tankShot()

    val tank62 = Tank("T-62", null)
    tank62.loadingMissile(Ammunition.GREEN.id)
    tank62.tankShot()

    val tank90 = Tank("Т-90", null)
    tank90.loadingMissile(Ammunition.RED.id)
    tank90.tankShot()

    val tankTiger = Tank("Тигр", null)
    tankTiger.tankShot()
}

class Tank(private val title: String, private var missile: Int?) {

    fun loadingMissile(id: Int) {
        missile = id
    }

    fun tankShot() {
        if (missile == null) {
            println("Танк не заряжен.")
        } else {
            println("Танк $title произвел выстрел, нанесенный урон $missile.")
        }
    }
}

enum class Ammunition(val id: Int) {
    BLUE(5),
    GREEN(10),
    RED(20)
}
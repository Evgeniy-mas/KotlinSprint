package org.example.lesson_19

fun main() {
    val tank34 = Tank("Т-34")
    tank34.loadingMissile(Ammunition.BLUE)
    tank34.tankShot()

    val tank62 = Tank("T-62")
    tank62.loadingMissile(Ammunition.GREEN)
    tank62.tankShot()

    val tank90 = Tank("Т-90")
    tank90.loadingMissile(Ammunition.RED)
    tank90.tankShot()

    val tankTiger = Tank("Тигр")
    tankTiger.tankShot()
}

class Tank(private val title: String, private var missile: Ammunition? = null) {

    fun loadingMissile(bullet: Ammunition) {
        missile = bullet
    }

    fun tankShot() {
        if (missile == null) {
            println("Танк не заряжен!")
        } else {
            println("Танк $title произвел выстрел, нанесенный урон ${missile?.id}.")
        }
    }
}

enum class Ammunition(val id: Int) {
    BLUE(5),
    GREEN(10),
    RED(20)
}
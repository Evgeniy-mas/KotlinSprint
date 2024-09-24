package org.example.lesson_16

fun main() {
    val circle = Circle2(18)
    circle.calculateArea()
    circle.calculatePerimeter()
}

class Circle2(private val radius: Int) {

    fun calculateArea() {
        val s = radius * NUMBER_PI
        println("Площадь круга равна: ${String.format("%.0f", s)}")
    }

    fun calculatePerimeter() {
        val p = 2.0 * NUMBER_PI * radius
        println("Длина окружности равна: ${String.format("%.0f", p)}")
    }
}

private const val NUMBER_PI = 3.14
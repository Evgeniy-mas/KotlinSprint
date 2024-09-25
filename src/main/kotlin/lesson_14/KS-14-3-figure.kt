package org.example.lesson_14

fun main() {
    val circle = Circle("black", 5)
    val rectangle = Rectangle("black", 5, 7)

    val circle2 = Circle("white", 7)
    val rectangle2 = Rectangle("white", 10, 7)

    val figure = listOf(circle, rectangle, circle2, rectangle2)

    var area = 0.0
    var perimeter = 0.0

    figure.forEach {
        if (it.color == "black") {
            perimeter += it.calculatePerimeter()
        } else if (it.color == "white") {
            area += it.calculateArea()
        }
    }
    println("Сумма периметров черных фигур: ${String.format("%.0f", perimeter)}")
    println("Сумма площадей белых фигур: ${String.format("%.0f", area)}")
}

abstract class Figure {

    abstract val color: String

    abstract fun calculateArea(): Double

    abstract fun calculatePerimeter(): Double
}

class Circle(override val color: String, val radius: Int) : Figure() {

    override fun calculateArea(): Double = Math.pow(radius.toDouble(), EXPONENT) * PI_NUMBER

    override fun calculatePerimeter(): Double = CONVERT_NUMBER * PI_NUMBER * radius
}

class Rectangle(override val color: String, val length: Int, val width: Int) : Figure() {

    override fun calculateArea(): Double = length * width.toDouble()

    override fun calculatePerimeter(): Double = CONVERT_NUMBER * (length + width).toDouble()
}

const val PI_NUMBER = 3.14
const val CONVERT_NUMBER = 2
const val EXPONENT = 2.0
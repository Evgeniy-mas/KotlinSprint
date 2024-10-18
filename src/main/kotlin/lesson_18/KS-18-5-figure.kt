package org.example.lesson_18

fun main() {
    val circle = Circle3("круг", 6)
    val square = Square3("квадрат", 10)
    val point = Point("точка")


    circle.draw(3, 5, circle)
    square.draw(5, 12f, square)
    point.draw(7.7f, 12, point)
    point.draw(2.4f, 6.6f, point)
}

class Circle3(title: String, val radius: Int) : Screen(title)

class Square3(title: String, val side: Int) : Screen(title)

class Point(title: String) : Screen(title)

open class Screen(private val title: String) {

    fun draw(x: Int, y: Int, figure: Screen) {
        println("Рисуем фигуру ${figure.title}, по координатам - $x и $y")
    }

    fun draw(x: Int, y: Float, figure: Screen) {
        println("Рисуем фигуру ${figure.title} по координатам - $x и $y ")
    }

    fun draw(x: Float, y: Int, figure: Screen) {
        println("Рисуем ${figure.title} по координатам - $x и $y")
    }

    fun draw(x: Float, y: Float, figure: Screen) {
        println("Рисуем ${figure.title} по координатам - $x и $y")
    }
}
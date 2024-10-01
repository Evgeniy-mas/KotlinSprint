package org.example.lesson_18

fun main() {
    val rectbox = RectangularBox(14, 7, 9)
    val cube = CubeBox(8)

    rectbox.calculateArea()
    cube.calculateArea()
}

abstract class Parcel {
    abstract fun calculateArea()
}

class CubeBox(val length: Int) : Parcel() {

    override fun calculateArea() {
        val s = length * length * CONVERT_CUBE
        println("Площадь кубической посылки: $s")
    }

}

class RectangularBox(val length: Int, val height: Int, val width: Int) : Parcel() {

    override fun calculateArea() {
        val s = CONVERT_RECTANGULAR * ((height * width) + (width * length) + (height * length))
        println("Площадь прямоуголной посылки: $s")
    }
}

const val CONVERT_CUBE = 6
const val CONVERT_RECTANGULAR = 2
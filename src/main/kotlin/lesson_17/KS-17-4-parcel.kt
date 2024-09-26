package org.example.lesson_17

fun main() {
    val parcel = Package(2, "Владивосток")

    parcel.location = "якутск"
    println(parcel.counter)

    parcel.location = "Ярославль"
    println(parcel.counter)

    parcel.location = "Москва"
    println(parcel.counter)
}

class Package(val numberPackage: Int, _location: String) {
    var counter = 0

    var location = _location
        set(value) {
            if (value !== field) {
                counter++
            }
            field = value
        }
}
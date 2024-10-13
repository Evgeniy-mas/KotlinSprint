package org.example.lesson_15

fun main() {
    val reno = PassengerCar("Рено", 3)
    val mazda = PassengerCar("Мазда", 2)
    val volvo = TruckCar("Вольво", 1, 2)

    reno.loadPassenger()
    reno.drive()
    reno.unloadingPassenger()
    println()

    volvo.loadPassenger()
    volvo.transportingCargo()
    volvo.drive()
    volvo.unloadingPassenger()
    volvo.unloadingCargo()
    println()

    mazda.loadPassenger()
    mazda.drive()
    mazda.unloadingPassenger()
}

abstract class Cars(val title: String, val passengers: Int) : DriveCar  {

    fun stopAuto() {
        println("Автомобиль прибыл по адресу.")
    }
}

class PassengerCar(title: String, passengers: Int) : Cars(title, passengers),TransportationPassenger {

    override fun loadPassenger() {
        if (passengers > 3) {
            println("Автомобиль не может везти больше трех человек.")
        } else println("В автомобиль погрузились $passengers человека.")
    }

    override fun drive() {
        if (passengers > 3) {
            println("Автомобиль перегружен.")
        } else println("Автомобиль $title начинает движение.")
        stopAuto()
    }
}

class TruckCar(title: String, passengers: Int, private val cargo: Int):
    Cars(title, passengers), TransportationCargo,TransportationPassenger {

    override fun loadPassenger() {
        if (passengers > 1) {
            println("Автомобиль $title не может везти больше одного человека.")
        } else println("В автомобиль погрузились $passengers человек")
    }

    override fun transportingCargo() {
        if (cargo > 2) {
            println("Автомобиль $title не может вести груз более 2 тонн")
        } else println("Автомобиль $title загружен грузом.")
    }

    override fun drive() {
        if (cargo > 2) {
            println("Автомобиль не может везти более двух тонн груза!")
        } else if (passengers > 1) {
            println("В автомобиле может ехать, только один человек!")
        } else println("Автомобиль $title начинает движение.")
        stopAuto()
    }
}

interface DriveCar {
    fun drive()
}

interface TransportationCargo {
    fun transportingCargo()

    fun unloadingCargo() {
        println("Началась выгрузка груза автомобиля.")
    }
}

interface TransportationPassenger {
    fun loadPassenger()

    fun unloadingPassenger() {
        println("Пассажиры вышли из автомобиля.")
    }
}
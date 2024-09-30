package org.example.lesson_14

fun main() {
    val sputnik = Satellite("Charon")
    val sputnik2 = Satellite("Hydra")

    val planet = Planet("Pluto", listOf(sputnik, sputnik2))

    planet.printPlanetInfo()
    sputnik.isAtmosphere = true
    sputnik.haveAtmosphere()
    sputnik2.landing()
}

open class SpaceObject(val name: String) {
     var isAtmosphere = false
     val isPossibilityLanding = false

    fun haveAtmosphere() {
        println("Наличие атмосферы на спутнике $name: $isAtmosphere")
    }

    fun landing() {
        println("Возможность высадки на спутник $name: $isPossibilityLanding")
    }
}

class Planet(name: String, val list: List<Satellite>) : SpaceObject(name) {

    fun printPlanetInfo() {
        println("Планета $name имеет спутники: ${list.map { it.name }.joinToString()}")
    }
}

class Satellite(name: String) : SpaceObject(name)



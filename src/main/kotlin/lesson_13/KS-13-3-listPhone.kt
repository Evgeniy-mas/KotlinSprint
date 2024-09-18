package org.example.lesson_13

fun main() {
    val list = listOf(
        UserdataClass("Evgeniy", 89032225478, "facebook"),
        UserdataClass("Petr", 89056664789, null),
        UserdataClass("Jack", 84958789587, "null"),
        UserdataClass("Sergei", 84958787789, "Suzuki"),
        UserdataClass("Mag", 84556965478, null)
    )
    for (i in list.mapNotNull { it.company }) {
        println(i)
    }
}

class UserdataClass(val name: String, val number: Long, val company: String?) {
}

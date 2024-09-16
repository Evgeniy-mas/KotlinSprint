package org.example.lesson_13

fun main() {
    val list = listOf(
        UserdataClass("Evgeniy", 89032225478, "facebook"),
        UserdataClass("Petr", 89056664789, null),
        UserdataClass("Jack", 84958789587, "null"),
        UserdataClass("Sergei", 84958787789, "Suzuki"),
        UserdataClass("Mag", 84556965478, null)
    )
    list.forEach { it.printCompany() }
}

class UserdataClass(val name: String, val number: Long, val company: String?) {

    fun printCompany() {
        println(company ?: "<Не указано>")
    }
}

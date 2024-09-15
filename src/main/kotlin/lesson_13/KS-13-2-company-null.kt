package org.example.lesson_13

fun main() {
    val user = Userdata("Evgeniy", 89265554789, null)

    user.printUser()
}

class Userdata(val name: String, val number: Long, val company: String?) {

    fun printUser() {
        print("Имя:$name\nНомер телефона:$number\nКомпания:${company ?: "<Не указано>"}")
    }
}

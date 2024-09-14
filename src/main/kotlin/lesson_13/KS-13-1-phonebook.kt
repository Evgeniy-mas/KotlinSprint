package org.example.lesson_13

fun main() {
    val user = PhoneBook("Evgeniy", 89265554789, null)

    print("${user.name}, ${user.number}, ${user.company}")
}

class PhoneBook(val name: String, val number: Long, val company: String?) {
}
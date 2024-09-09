package org.example.lesson_11

fun main() {
    val user = DataUser(11234,"user", 1999456,"user1@yandex.ru",)
    val user2 = DataUser(34234,"user2",1324324,"user2@gmail.com",)

    println(user.id)
    println(user.login)
    println(user.password)
    println(user.mail)

    println()

    println(user2.id)
    println(user2.login)
    println(user2.password)
    println(user2.mail)
}

class DataUser(
    val id: Int,
    val login: String,
    val password: Int,
    val mail:String,
) {}
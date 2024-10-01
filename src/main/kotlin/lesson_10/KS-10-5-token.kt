package org.example.lesson_10

import kotlin.system.exitProcess

fun main() {
    println("Введите ваш логин:")
    val login = readln().lowercase()

    println("Введитие ваш пароль:")
    val password = readln().toInt()

    val tokenSignature = 32

    val check: String? = verifyUser(login, password)

    if (check == null) {
        println("Авторизация не удалась!")
    } else if (check.length == tokenSignature) {
        val product = getBasket(check)
        println(product)
    } else exitProcess(1)
}

fun verifyUser(log: String, pass: Int): String? {
    val char = (0..9) + ('a'..'z') + ('A'..'Z')
    var accessToken: String? = ""

    for (i in 1..32) {
        accessToken += char.random().toString()
    }

    var verification: String? = null
    if (log == LOGIN && pass == PASSWORD) {
        verification = accessToken
    }
    return verification
}

fun getBasket(token: String): String = BASKET

const val LOGIN = "user"
const val PASSWORD = 1234
const val BASKET = "гводи, молоток, дрель, стамеска"
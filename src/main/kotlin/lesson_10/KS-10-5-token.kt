package org.example.lesson_10

fun main() {
    println("Введите ваш логин:")
    val login = readln().lowercase()

    println("Введитие ваш пароль:")
    val password = readln().toInt()

    val check: String? = passVerification(login, password)

    if (check == null) {
        println("Авторизация не удалась!")
    } else {
        val product = getBasket(check)
        println(product)
    }
}

fun passVerification(log: String, pass: Int): String? {
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

fun getBasket(token: String): String {
    val tokenSignature = 32

    return if (token.length == tokenSignature) BASKET else "Ошибка #401"
}

const val LOGIN = "user"
const val PASSWORD = 1234
const val BASKET = "гводи, молоток, дрель, стамеска"
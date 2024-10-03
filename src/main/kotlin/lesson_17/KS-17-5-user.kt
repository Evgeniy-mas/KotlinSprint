package org.example.lesson_17

fun main() {
    val user = User5("Jack", "12pf55")
    println(user.password)
    user.password = "345po9"

    user.login = "Petr"
}

class User5(_login: String, _password: String) {

    var password = _password
        get() = "******"
        set(value) {
            if (value !== field) {
                println("Вы не можете изменить пароль!")
            }
        }

    var login = _login
        set(value) {
            if (value !== field) {
                println("Логин успешно изменен!")
                field = value
            }
        }
}
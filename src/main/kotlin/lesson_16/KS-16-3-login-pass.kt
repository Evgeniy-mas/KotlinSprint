package org.example.lesson_16

fun main() {
    val user = UserData()

    println(checkData(user.sendData()))
}

fun checkData(data:String):Boolean = data == "Evgeniy1234"

class UserData {

    private var login = "Evgeniy"
    private var password = "1234"

    fun sendData():String = login + password
}
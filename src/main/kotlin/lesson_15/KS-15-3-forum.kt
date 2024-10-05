package org.example.lesson_15

fun main() {
    val admin = Administrator("Admin")
    val user = Users("Jack")
    val user2 = Users("Jane")

    user.readMessage()
    user.enterMessage()
    println()

    admin.enterMessage()
    admin.deleteMessage(user)
    admin.deleteUser(user)
    admin.deleteUser(user2)
}

abstract class Forum(val name: String) {

    abstract fun readMessage()

    abstract fun enterMessage()
}

class Administrator(name: String) : Forum(name) {

    override fun readMessage() {
        println("Администратор $name, читает сообщения форума.")
    }

    override fun enterMessage() {
        println("Администартор форума $name, написал сообщение.")
    }

    fun deleteMessage(user: Users) {
        println("Администратор $name удалил сообщение пользователя ${user.name}.")
    }

    fun deleteUser(user: Users) {
        println("Администратор $name, удалил пользователя ${user.name}.")
    }
}

class Users(name: String) : Forum(name) {

    override fun readMessage() {
        println("Участник $name, читает сообщения форума.")
    }

    override fun enterMessage() {
        println("Участник форума $name, написал сообщение.")
    }
}
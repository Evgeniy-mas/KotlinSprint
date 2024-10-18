package org.example.lesson_11

fun main() {
    val forum = Forum()
    val user = forum.createNewUser("Petr")
    val user2 = forum.createNewUser("Sam")

    forum.createNewMessage(user.userId, "Привет.")
    forum.createNewMessage(user2.userId, "Привет.")

    forum.createNewMessage(user.userId, "Наша встреча в силе?")
    forum.createNewMessage(user2.userId, "Да, все как договаривались!")

    forum.printThread()
}

class Forum {
    val listMember: MutableList<MemberForum> = mutableListOf()
    val listMessage: MutableList<String> = mutableListOf()

    var idNumber = 1

    fun createNewUser(name: String): MemberForum {

        val createUser = MemberForum(++idNumber, name)
        listMember.add(createUser)

        return createUser
    }

    fun createNewMessage(userId: Int, message: String) {
        if (userId !in 1..idNumber) {
            println("Пользователь не найден!")
        }
        val addMessage = MessageForum(userId, message)
        listMember.forEach { memberForum: MemberForum ->
            if (addMessage.authorId == memberForum.userId)
                listMessage.add("${memberForum.userName}:${addMessage.message}")
        }
    }

    fun printThread() {
        listMessage.forEach { println(it) }

    }
}

class MemberForum(val userId: Int, val userName: String)

class MessageForum(val authorId: Int, val message: String)

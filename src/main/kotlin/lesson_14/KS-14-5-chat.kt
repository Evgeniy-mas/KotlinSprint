package org.example.lesson_14

fun main() {
    val chat = Chat()
    val message = chat.addMessage("Bill", "Всем привет!")
    val message2 = chat.addMessage("Nick", "Куда я попал?")

    chat.addThreadMessage("Vlad", "Привет!", message)
    chat.addThreadMessage("Lucy", "Тот же вопрос :)", message2)

    chat.printChat()
}

class Chat {
    private var idInd = 0
    private val allMessage = mutableListOf<Message>()

    fun addMessage(name: String, textMessage: String): Int {
        val message = Message(idInd++, name, textMessage)
        allMessage.add(message)
        return message.id
    }

    fun addThreadMessage(name: String, message: String, parentMessageId: Int) {
        val threadMessage = ChildMessage(idInd++, name, message, parentMessageId)
        allMessage.add(threadMessage)
    }

    fun printChat() {
        allMessage.groupBy { if (it is ChildMessage) it.parentMessageId else it.id }
            .forEach { (key, value) ->
                value.forEach { msg ->
                    if (msg is ChildMessage) println("\tChildMessage: (Имя: ${msg.name}): ${msg.message}")
                    else println("Message: (Имя:  ${msg.name}): ${msg.message}")
                }
            }
    }
}

open class Message(val id: Int, val name: String, val message: String)

class ChildMessage(id: Int, name: String, message: String, val parentMessageId: Int) :
    Message(id, name, message)
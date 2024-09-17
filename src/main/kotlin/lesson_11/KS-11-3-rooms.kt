package org.example.lesson_11


fun main() {
    val evgeniy = RoomMovie(
        "обложка",
        "киноманы",
        mutableListOf("Sasha", "Neit"),
        "Evgeniy",
    )
    val mike = RoomMusic(
        "обложка",
        "меломаны",
        mutableListOf("Музыкант, Masha"),
        "Mike",
        "микрофон выключен"
    )

    evgeniy.addUser()
    evgeniy.printInfoUser()
    evgeniy.changeStatus()

    println()

    mike.addUser()
    mike.printInfoUser()
    mike.changeStatus2()
}

open class RoomMovie(
    val cover: String,
    val title: String,
    val party: List<String>,
    val avatarUser: String,
    var status: String = "разговаривает"
) {
    val status2 = "Микрофон выключен."
    val status3 = "Пользователь заглушен."

    fun addUser() {
        println("Участник $avatarUser добавлен в комнату $title.")
    }

    fun changeStatus() {

        println("Учстник комнаты $avatarUser изменил статус $status на: $status2 ")
    }

    fun changeStatus2() {

        println("Учстник комнаты $avatarUser изменил статус $status на: $status3  ")
    }

    fun printInfoUser() {
        println(
            "Участник c ником $avatarUser в комнате $title($cover)," +
                    "людей в комнтате $party статус: $status "
        )
    }
}

class RoomMusic(
    cover: String,
    title: String,
    party: List<String>,
    avatarUser: String,
    status: String
) : RoomMovie(cover, title, party, avatarUser, status) {
}
package org.example.lesson_11

fun main() {
    val participant = Participant("Evgeniy", STATUS, "фото")

    val room = Rooms("постер", "киноманы")

    room.addParticipant(participant, room.participantList)
    participant.changeStatus(STATUS3)
    room.avatarClicking(participant)
}

class Participant(
    val nikName: String,
    var status: String,
    val avatar: String,
) {
    fun changeStatus(stat: String) {

        println("Пользователь $nikName, сменил статус $status на $stat.")
        status = stat
    }
}

class Rooms(
    val cover: String,
    val nameRoom: String,
    val participantList: MutableList<Participant> = mutableListOf()
) {

    fun addParticipant(participant: Participant, list: MutableList<Participant>) {
        list.add(participant)
        println("Участник ${participant.nikName}, добавлен в комнату $nameRoom, обложка: $cover. ")
    }

    fun avatarClicking(participant: Participant) {
        println("Участник ${participant.nikName}, аватарка ${participant.avatar}, статус: ${participant.status}.")

    }
}

const val STATUS = "разговаривает"
const val STATUS2 = "пользователь заглушен"
const val STATUS3 = "микрофон выключен"
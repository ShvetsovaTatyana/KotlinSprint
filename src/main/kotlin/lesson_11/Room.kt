package org.example.lesson_11

fun main() {
}

class Room(
    val cover: String,
    var name: String,
    val listOfParticipants: ArrayList<String>,
    val nickname: String,
    var speakerStatus: String,
) {
    fun addingAParticipant() {

    }

    fun statusUpdate() {
        println("Введите новое имя")
        val nameNew = readln()
        name = nameNew
        println("Введите новый статус из предложенных: разговаривает, микрофон выключен, пользователь заглушен")
        val speakerStatusNew = readln()
        speakerStatus = speakerStatusNew
    }
}
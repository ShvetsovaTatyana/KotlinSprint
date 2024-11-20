package org.example.lesson_11

fun main() {
    val room: Room =
        Room(
            cover = "ссылка на картинку",
            name = "Название комнаты",
            listOfParticipants = "Список участников(ссылки на аватарку)",
            nickname = "Имя участника",
            speakerStatus = "Статус говорящего"
        )
    val person: Person = Person(
        cover = "ссылка на картинку",
        name = "Комната любителей йоги",
        listOfParticipants = "Список участников(ссылки на аватарку)",
        nickname = "Таня",
        speakerStatus = "микрофон выключен"
    )
}

class Person(
    val cover: String,
    var name: String,
    val listOfParticipants: String,
    val nickname: String,
    var speakerStatus: String,
) {}


class Room(
    val cover: String,
    var name: String,
    val listOfParticipants: String,
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
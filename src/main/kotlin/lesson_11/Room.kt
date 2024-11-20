package org.example.lesson_11

fun main() {
    val room: Room =
        Room(
            cover = "ссылка на картинку",
            name = "Название комнаты",
            listOfParticipants = mutableListOf(),
        )
    val person: Person = Person(
        cover = "ссылка на картинку",
        nickname = "Таня",
        speakerStatus = "микрофон выключен"
    )
}

class Person(
    val cover: String,
    val nickname: String,
    var speakerStatus: String,
) {}


class Room(
    val cover: String,
    var name: String,
    val listOfParticipants: MutableList<Person>,

    ) {
    fun addingAParticipant(person: Person) {
        listOfParticipants.add(person)
    }

    fun statusUpdate(nickname: String, speakerStatus: String) {

    }
}
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
    val participant1 = Person("user1", "avatar1.jpg", "разговаривает")
    val participant2 = Person("user2", "avatar2.jpg", "микрофон выключен")

    room.addPerson(participant1)
    room.addPerson(participant2)
    room.updateStatus(participant1.nickname, "пользователь заглушен")
}

class Person(
    val cover: String,
    val nickname: String,
    var speakerStatus: String,
)

class Room(
    val cover: String,
    val name: String,
    val listOfParticipants: MutableList<Person>,
) {
    fun addPerson(person: Person) {
        listOfParticipants.add(person)
    }

    fun updateStatus(nickname: String, speakerStatus: String) {
        val nicknameNew = listOfParticipants.find { it.nickname == nickname }
        if (nicknameNew != null) {
            listOfParticipants.add(nicknameNew)
        }
        val speakerStatusNew = listOfParticipants.find { it.speakerStatus == speakerStatus }
        if (speakerStatusNew != null) {
            listOfParticipants.add(speakerStatusNew)
        }
    }
}
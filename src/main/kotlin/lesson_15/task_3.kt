package org.example.lesson_15

fun main() {
    val user = Users("Изображение", "Максим", "В сети")
    val administrator = Administrators("Изображение", "Михаил", "В сети")
    println(
        "${user.name}-${user.readTheForum()}\n${user.name}-${user.writeMessages()}\n" +
                "${administrator.name}-${administrator.readTheForum()}\n" +
                "${administrator.name}-${administrator.writeMessages()}\n" +
                "${administrator.name}-${administrator.deleteMessages()}\n" +
                "${administrator.name}-${administrator.deleteUser()}"
    )
}

abstract class Forum(
    val icon: String,
    val name: String,
    val status: String,
) {
    fun readTheForum(): String {
        val read = "Сообщение прочитано"
        return read
    }

    fun writeMessages(): String {
        val write = "Набирает сообщение"
        return write
    }
}

class Users(icon: String, name: String, status: String) : Forum(icon, name, status)

class Administrators(icon: String, name: String, status: String) : Forum(icon, name, status) {
    fun deleteMessages(): String {
        val deleteMessages = "Удалил сообщение"
        return deleteMessages
    }

    fun deleteUser(): String {
        val deleteUser = "Удалил пользователя"
        return deleteUser
    }
}
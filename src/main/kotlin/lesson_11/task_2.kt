package org.example.lesson_11

fun main() {
    val i = UserData2(
        id = 3,
        login = "shvetsovaTatyana",
        password = "Bella-2024",
        mail = "shvetsovaTatyana@mail.ru",
    )
    i.textReadingAWriting()
    i.changePassword()
    i.print()
}

class UserData2(
    val id: Int,
    val login: String,
    var password: String,
    val mail: String,
    var bio: String = "",
) {
    fun print() {
        println("Мои данные: идентефикатор: $id,логин: $login,пароль: $password,почта: $mail,о себе: $bio")
    }

    fun textReadingAWriting() {
        val text = readln()
        bio = text
    }

    fun changePassword() {
        println("Введите текущий пароль")
        val currentPassword = readln()
        if (currentPassword == password) {
            println("Введите новый пароль")
            val passwordNew = readln()
            password = passwordNew
            println("Пароль изменен с $currentPassword на $passwordNew")
        }
    }
}
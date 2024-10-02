package org.example.lesson_5

fun main() {
    println("Введите имя пользователя")

    val name: String = "Zaphod"
    val password: String = "PanGalactic"
    val nameInput: String = readln()

    if (nameInput == name) {
        println("Введите пароль")
        val passwordInput: String = readln()
        if (passwordInput == password) println(
            "Ваши данные проверены, и о, чудо, они верны... " +
                    "Пользователь \"Zaphod\", вам разрешено входить на борт корабля \"Heart of Gold\". " +
                    "Хотя мне всё равно... Ну вперед, войдите... Если вам так уж надо, в конце концов... " +
                    "Надеюсь, вам понравится пребывание здесь больше, чем мне."
        )
    } else println("Вам нужно зарегестрироваться")
}
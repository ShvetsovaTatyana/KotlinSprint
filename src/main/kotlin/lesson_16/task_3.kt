package org.example.lesson_16

fun main() {
    val user = User("Bella@mail.ru", "Bella-2024")
    val passwordCheckResult = user.checkPassword("Bella-2024")
    println(passwordCheckResult)
}

class User(val login: String, private val password: String) {
    fun checkPassword(password: String): String {
        if (password == this.password)
            return "Пароль корректный"
        else
            return "Пароль не корректный"
    }
}
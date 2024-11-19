package org.example.lesson_11


fun main() {
    val userOne = UserData(
        id = 1,
        login = "User1",
        password = "rgvrtf",
        mail = "User1@mail.ru"
    )
    val userTwo = UserData(
        id = 2,
        login = "User2",
        password = "efvfg",
        mail = "User2@mail.ru"
    )
    println(
        "Пользователь 1: идентификатор:${userOne.id}, логин:${userOne.login}, пароль:${userOne.password}, " +
                "почта:${userOne.mail}"
    )
    println(
        "Пользователь 2: идентификатор:${userTwo.id}, логин:${userTwo.login}, пароль:${userTwo.password}, " +
                "почта:${userTwo.mail}"
    )
}

class UserData(
    val id: Int,
    val login: String,
    val password: String,
    val mail: String,
) {

}



package org.example.lesson_1_10.lesson_10

const val MAXIMUM_LENGTH = 5

fun main() {

    println("Введите логин")
    val login = readingLogin()
    val loginLength = login.length

    println("Введите пароль")
    val password = readPassword()
    val passwordLength = password.length
    dataLength(loginLength, passwordLength)
}

fun readingLogin(): String {
    val login = readln()
    return login
}

fun readPassword(): String {
    val password = readln()
    return password
}

fun dataLength(loginLength: Int, passwordLength: Int) {
    if (loginLength < MAXIMUM_LENGTH || passwordLength < MAXIMUM_LENGTH)
        println("Логин или пароль недостаточно длинные")
    else
        println("Добро пожаловать!")
}
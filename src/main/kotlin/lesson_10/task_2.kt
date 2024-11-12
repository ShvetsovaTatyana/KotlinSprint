package org.example.lesson_10

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
    if (loginLength < 5 || passwordLength < 5)
        println("Логин или пароль недостаточно длинные")
    else
        println("Добро пожаловать!")
}
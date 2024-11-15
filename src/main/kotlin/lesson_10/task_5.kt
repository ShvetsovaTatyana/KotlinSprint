package org.example.lesson_10

const val LOGIN = "polinko.tatyana@mail.ru"
const val PASSWORD = "Bella-2024"

fun main() {
    val token = authorization()
    val cart = receivingCart(token)
    if (cart != null)
        println(cart)
    else
        println("Неудачная авторизация")
}


fun creatingALogin(): String {
    val login = readln()
    return login
}

fun creatingAPassword(): String {
    val password = readln()
    return password
}

fun authorization(): String? {
    if (LOGIN == creatingALogin() && PASSWORD == creatingAPassword()) {
        var accessToken = ""

        for (i in 1..32) {
            val numberPassword = 1.rangeTo(9).random().toString()
            val lowercaseLetter = 'a'.rangeTo('z').random().lowercase()
            val capitalLetter = 'a'.rangeTo('z').random().uppercase()
            val charRandom = ' '.rangeTo('/').random()
            accessToken += (numberPassword + lowercaseLetter + capitalLetter + charRandom).random().toString()
        }
        return accessToken
    } else
        return null
}

fun receivingCart(tokenCart: String?): ArrayList<String>? {
    val onlineStoreCart = arrayListOf("мыло", "шампунь", "порошок", "гель для душа", "зубная паста")
    if (tokenCart != null)
        return onlineStoreCart
    else
        return null
}
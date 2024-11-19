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
        val numberPassword = 1.rangeTo(9)
        val letter = 'a'.rangeTo('z')
        val charRandom = ' '.rangeTo('/')

        for (i in 1..32) {
            accessToken += (numberPassword.random().toString() + letter.random()
                .lowercase() + letter.random().uppercase() + charRandom.random()).random().toString()
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
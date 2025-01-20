package org.example.lesson_13

class TelephoneDirectoryFive(
    var phoneNumber: Long? = null,
    var company: String? = null,
)

fun main() {
    val person = TelephoneDirectoryFour()
    println("Введите номер телефона")
    try {
        person.phoneNumber = readlnOrNull()?.toLong()
    } catch (e: Exception) {
        println(e::class.java.simpleName)
    }
}

package org.example.lesson_13

fun main() {
    val person = TelephoneDirectoryTwo("Антон", 89185624512)
    person.printInformation()
}

class TelephoneDirectoryTwo(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
) {
    fun printInformation() {
        val companyNew = company ?: "не указано"
        println("Имя:${name}\nНомер:${phoneNumber}\nКомпания:$companyNew")
    }
}
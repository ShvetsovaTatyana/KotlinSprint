package org.example.lesson_13

fun main() {
    val person = TelephoneDirectoryTwo("Антон", 89185624512)
    person.printInformation(person)
}

class TelephoneDirectoryTwo(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
) {
    fun printInformation(person: TelephoneDirectoryTwo) {
        val companyNew = person.company ?: "не указано"
        println("Имя:${person.name}\nНомер:${person.phoneNumber}\nКомпания:$companyNew")
    }
}
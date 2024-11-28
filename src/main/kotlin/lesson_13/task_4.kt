package org.example.lesson_13

fun main() {
    val person = TelephoneDirectoryFour()
    val contactList: MutableList<TelephoneDirectoryFour> = mutableListOf()
    person.addContact(contactList)
}

class TelephoneDirectoryFour(
    var phoneNumber: Long? = null,
    var company: String? = null,
) {
    fun addContact(contactList: MutableList<TelephoneDirectoryFour>) {
        for (i in 1..5) {
            println("Введите номер телефона")
            phoneNumber = readLine()?.toLongOrNull()
            if (phoneNumber == null) {
                println("Такая запись не может быть добалвена")
                continue
            } else
                println("Введите компанию")
            company = readLine()
            val person = TelephoneDirectoryFour(phoneNumber, company)
            contactList.add(person)
        }
        for (i in contactList) {
            println("Номер телефона:${i.phoneNumber}, название компании ${i.company}} ")
        }
    }
}
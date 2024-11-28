package org.example.lesson_13

fun main() {
    val personOne = TelephoneDirectoryTree("МТС")
    val personTwo = TelephoneDirectoryTree("Билайн")
    val personTree = TelephoneDirectoryTree(null)
    val personFour = TelephoneDirectoryTree(null)
    val personFive = TelephoneDirectoryTree("null")
    val contactList: List<TelephoneDirectoryTree> = listOf(personOne, personTwo, personTree, personFour, personFive)
    for (i in contactList) {
        if (i.company != null)
            println(i.company)
    }
}

class TelephoneDirectoryTree(
    val company: String? = null,
)
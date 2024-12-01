package org.example.lesson_13

fun main() {
    val personOne = TelephoneDirectoryTree("МТС")
    val personTwo = TelephoneDirectoryTree("МТС")
    val personTree = TelephoneDirectoryTree(null)
    val personFour = TelephoneDirectoryTree(null)
    val personFive = TelephoneDirectoryTree("null")
    val contactList: List<TelephoneDirectoryTree> = listOf(personOne, personTwo, personTree, personFour, personFive)
    val contactListNew = contactList.mapNotNull { it.company }.toSet()
    println(contactListNew)
}

class TelephoneDirectoryTree(
    val company: String? = null,
)
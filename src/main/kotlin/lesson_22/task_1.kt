package org.example.lesson_22

fun main() {
    val bookOne = RegularBook("Война и мир", "Лев Толстой")
    val bookTwo = RegularBook("Война и мир", "Лев Толстой")
    val bookTree = DataBook("Война и мир", "Лев Толстой")
    val bookFour = DataBook("Война и мир", "Лев Толстой")
    println("${bookOne == bookTwo}\n${bookTree == bookFour}") //при сравнении объектов обычных классов приосходит сравнение ссылок,
// а при сравнении объектов data class сравниваются сами объекты,поэтому и результаты сравнения отличаются

}

class RegularBook(
    val name: String,
    val author: String,
)

data class DataBook(
    val name: String,
    val author: String,
)
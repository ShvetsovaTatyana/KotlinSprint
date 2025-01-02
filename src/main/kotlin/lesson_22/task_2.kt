package org.example.lesson_22

fun main() {
    val bookOne = OrdinaryBook("Война и мир", "Лев Толстой")
    val bookTwo = SpecialBook("Война и мир", "Лев Толстой")
    println("$bookOne\n$bookTwo")//при попытке вывода инфы об экземпляре обычного класса происходит вывод Hashcode,
// обычный класс не может по умолчанию реализовать метод ToString(),
// это можно сделать вручную,переопределив его,тогда как при выводе инфы об экземпляре Data class
// он по умолчанию реализует метод ToString и поэтому происходит нормальный вывод информации


}

class OrdinaryBook(
    val name: String,
    val author: String,
)

data class SpecialBook(
    val name: String,
    val author: String,
)
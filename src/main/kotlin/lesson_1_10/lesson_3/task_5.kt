package org.example.lesson_1_10.lesson_3

fun main() {
    val chessMove = "D2-D4;0"
    val list = chessMove.split("-", ";")
    val where: String = list[0]
    val whereToGo: String = list[1]
    val number: Int = list[2].toInt()
    println(where)
    println(whereToGo)
    println(number)
}
package org.example.lesson_8

fun main() {

    println("Количество ингредиентов:")
    val array = Array(readln().toInt()) { readln() }
    println(array.joinToString(","))
}
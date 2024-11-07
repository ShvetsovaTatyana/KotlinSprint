package org.example.lesson_9

fun main() {

    val ingredientQuantityList = mutableListOf(2, 50, 15)
    println("Укажите количество порций")
    val numberOfServings = readln().toInt()
    val ingredientQuantityListNew = ingredientQuantityList.map { it * numberOfServings }
    println(ingredientQuantityListNew)
}
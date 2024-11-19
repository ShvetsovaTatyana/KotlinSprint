package org.example.lesson_1_10.lesson_9

fun main() {

    val ingredientQuantityList = mutableListOf(2, 50, 15)
    println("Укажите количество порций")
    val numberOfServings = readln().toInt()
    val ingredientQuantityListNew = ingredientQuantityList.map { it * numberOfServings }
    println(
        "На $numberOfServings порций вам понадобится: Яиц-${ingredientQuantityListNew[0]}," +
                " молока-${ingredientQuantityListNew[1]}, сливочного масла-${ingredientQuantityListNew[2]}"
    )
}
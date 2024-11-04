package org.example.lesson_8

fun main() {

    var ingredient = ""
    println("Количество ингредиентов:")
    val quantityOfIngredients = readln().toInt()
    val arrayOfIngredients: Array<String> = Array(quantityOfIngredients) { "" }

    for (i in 0 until quantityOfIngredients) {
        ingredient = readln()
        arrayOfIngredients[i] = ingredient
    }
    println(arrayOfIngredients.joinToString(","))
}
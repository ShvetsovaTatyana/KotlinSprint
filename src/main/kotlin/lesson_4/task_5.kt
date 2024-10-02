package org.example.lesson_4

fun main() {

    println("наличие повреждений корпуса")
    val isDamageToTheBody = readln().toBoolean()
    println("текущий состав экипажа")
    val crewComposition = readln().toInt()
    println(" количество ящиков с провизией на борту")
    val amountOfProvisions = readln().toInt()
    println("благоприятность метеоусловий")
    val isFavorableWeatherConditions = readln().toBoolean()

    println(
        (isDamageToTheBody == false && crewComposition in 55..70 && amountOfProvisions > 50) ||
                (isDamageToTheBody == true && crewComposition == 70 && amountOfProvisions >= 50 &&
                        isFavorableWeatherConditions == true)
    )
}
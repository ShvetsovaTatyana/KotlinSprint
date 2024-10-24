package org.example.lesson_4

const val CREW_COMPOSITION_MIN = 55
const val CREW_COMPOSITION_MAX = 70
const val AMOUNT_OF_PROVISIONS = 50

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
        (!isDamageToTheBody && crewComposition in CREW_COMPOSITION_MIN..CREW_COMPOSITION_MAX &&
                amountOfProvisions > AMOUNT_OF_PROVISIONS) ||
                (isDamageToTheBody && crewComposition == CREW_COMPOSITION_MAX &&
                        amountOfProvisions >= AMOUNT_OF_PROVISIONS && isFavorableWeatherConditions)
    )
}
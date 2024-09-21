package org.example.lesson_4

const val IS_WEATHER_SUNNY = true
const val IS_TENT_CURRENTLY_OPEN = true
const val AIR_HUMIDITY = 20
const val CURRENT_TIME_OF_YEAR = "зима"

fun main() {

    println(
        "Благоприятные ли условия сейчас для роста бобовых?${
            IS_WEATHER_SUNNY == true && IS_TENT_CURRENTLY_OPEN == true &&
                    AIR_HUMIDITY == 20 && CURRENT_TIME_OF_YEAR != "зима"
        }"
    )
}
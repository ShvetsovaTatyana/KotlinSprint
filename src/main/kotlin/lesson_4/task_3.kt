package org.example.lesson_4

const val IS_WEATHER_SUNNY = true
const val IS_TENT_CURRENTLY_OPEN = true
const val AIR_HUMIDITY = 20
const val UNFAVORABLE_TIME_OF_YEAR = "зима"

fun main() {
    val isWeatherSunnyNow = true
    val isTentCurrentlyOpenNow = true
    val airHumidityNow = 20
    val currentTimeOfYear = "зима"

    println(
        "Благоприятные ли условия сейчас для роста бобовых?${
            isWeatherSunnyNow == IS_WEATHER_SUNNY && isTentCurrentlyOpenNow == IS_TENT_CURRENTLY_OPEN &&
                    airHumidityNow == AIR_HUMIDITY && currentTimeOfYear != UNFAVORABLE_TIME_OF_YEAR

        }"
    )
}
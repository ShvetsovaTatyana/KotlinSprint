package org.example.lesson_4

const val IS_WEATHER_SUNNY = true
const val IS_TENT_CURRENTLY_OPEN = true
const val AIR_HUMIDITY = 20
const val CURRENT_TIME_OF_YEAR_SPRING = "весна"
const val CURRENT_TIME_OF_YEAR_SUMMER = "лето"
const val CURRENT_TIME_OF_YEAR_AUTUMN = "осень"

fun main() {
    val isWeatherSunnyNow = true
    val isTentCurrentlyOpenNow = true
    val airHumidityNow = 20
    val currentTimeOfYear = "зима"

    println(
        "Благоприятные ли условия сейчас для роста бобовых?${
            isWeatherSunnyNow == IS_WEATHER_SUNNY && isTentCurrentlyOpenNow == IS_TENT_CURRENTLY_OPEN &&
                    airHumidityNow == AIR_HUMIDITY && (currentTimeOfYear == CURRENT_TIME_OF_YEAR_SPRING ||
                    currentTimeOfYear == CURRENT_TIME_OF_YEAR_SUMMER ||
                    currentTimeOfYear == CURRENT_TIME_OF_YEAR_AUTUMN)
        }"
    )
}
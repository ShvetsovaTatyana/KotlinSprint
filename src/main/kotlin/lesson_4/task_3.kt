package org.example.lesson_4

fun main() {
    val theWeatherTodayIsSunny = true
    val tentIsCurrentlyOpen = true
    val airHumidity = 20
    val currentTimeOfYear = "зима"
    println(
        "Благоприятные ли условия сейчас для роста бобовых?${
            theWeatherTodayIsSunny == true && tentIsCurrentlyOpen == true && airHumidity == 20 && currentTimeOfYear == "не зима"
        }"
    )
}
package org.example.lesson_12

const val ABSOLUTE_ZERO = 273.15

fun main() {
    val dayOne = WeatherTree(
        300, 290, true
    )
    dayOne.printWeather()
}

class WeatherTree(daytimeTemperature: Int, nightTemperature: Int, isPresenceOfPrecipitation: Boolean) {
    val daytimeTemperature = daytimeTemperature
    val nightTemperature = nightTemperature
    val isPresenceOfPrecipitation = isPresenceOfPrecipitation

    fun printWeather() {
        val answer: String
        if (isPresenceOfPrecipitation)
            answer = "Да"
        else
            answer = "Нет"
        println(
            "Дневная температура:${(daytimeTemperature - ABSOLUTE_ZERO).toInt()}" +
                    " Ночная температура:${(nightTemperature - ABSOLUTE_ZERO).toInt()}" +
                    " Наличие осадков в течение суток: $answer"
        )
    }
}
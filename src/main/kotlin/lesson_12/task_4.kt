package org.example.lesson_12

const val ABSOLUTE_ZEROO = 273.15

fun main() {
    val dayOne = WeatherFour(
        300, 290, true
    )
}

class WeatherFour(daytimeTemperature: Int, nightTemperature: Int, isPresenceOfPrecipitation: Boolean) {
    val daytimeTemperature = daytimeTemperature
    val nightTemperature = nightTemperature
    val isPresenceOfPrecipitation = isPresenceOfPrecipitation

    init {
        val answer: String
        if (isPresenceOfPrecipitation)
            answer = "Да"
        else
            answer = "Нет"
        println(
            "Дневная температура:${(daytimeTemperature - ABSOLUTE_ZEROO).toInt()}" +
                    " Ночная температура:${(nightTemperature - ABSOLUTE_ZEROO).toInt()}" +
                    " Наличие осадков в течение суток: $answer"
        )
    }
}
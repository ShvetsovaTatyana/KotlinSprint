package org.example.lesson_12

fun main() {
    val dayOne = WeatherTwo(daytimeTemperature = 10, nightTemperature = 8, isPresenceOfPrecipitation = true)
    val dayTwo = WeatherTwo(daytimeTemperature = 12, nightTemperature = 5, isPresenceOfPrecipitation = false)

    dayOne.printWeather()
    dayTwo.printWeather()
}

class WeatherTwo(
    var daytimeTemperature: Int,
    var nightTemperature: Int,
    var isPresenceOfPrecipitation: Boolean,
) {

    fun printWeather() {
        val answer: String
        if (isPresenceOfPrecipitation)
            answer = "Да"
        else
            answer = "Нет"
        println(
            "Дневная температура:$daytimeTemperature" +
                    " Ночная температура:$nightTemperature" +
                    "Наличие осадков в течение суток: $answer"
        )
    }
}
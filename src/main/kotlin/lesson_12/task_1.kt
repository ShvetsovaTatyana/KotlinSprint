package org.example.lesson_12

fun main() {
    val dayOne = Weather()
    val dayTwo = Weather()

    dayOne.daytimeTemperature = 10
    dayOne.nightTemperature = 8
    dayOne.isPresenceOfPrecipitation = true
    dayTwo.daytimeTemperature = 12
    dayTwo.nightTemperature = 5
    dayTwo.isPresenceOfPrecipitation = false

    dayOne.printWeather()
    dayTwo.printWeather()
}

class Weather {
    var daytimeTemperature: Int = 5
    var nightTemperature: Int = 1
    var isPresenceOfPrecipitation: Boolean = true

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

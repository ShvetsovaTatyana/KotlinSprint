package org.example.lesson_15

fun main() {
    val temperature = Temperature(10)
    val precipitation = PrecipitationAmount(2)
    val weatherServer = WeatherServer()

    weatherServer.sendAMessage(temperature)
    weatherServer.sendAMessage(precipitation)
}

abstract class WeatherStationStats

class Temperature(val degrees: Int) : WeatherStationStats()

class PrecipitationAmount(val precipitation: Int) : WeatherStationStats()

class WeatherServer() {
    fun sendAMessage(message: WeatherStationStats) {
        when (message) {
            is Temperature -> println("Сегодня ${message.degrees} градусов")
            is PrecipitationAmount -> println("Сегодня выпало ${message.precipitation} мм осадков")
        }
    }
}
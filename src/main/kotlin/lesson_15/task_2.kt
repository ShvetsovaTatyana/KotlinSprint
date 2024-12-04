package org.example.lesson_15

fun main() {
    val temperature = Temperature(10)
    val precipitation = PrecipitationAmount(2)
    val weatherServer = WeatherServer()

    weatherServer.sendingAMessage(temperature)
    weatherServer.sendingAMessage(precipitation)
}

abstract class WeatherStationStats {
}

class Temperature(val degrees: Int) : WeatherStationStats()

class PrecipitationAmount(val precipitation: Int) : WeatherStationStats()

class WeatherServer() {
    fun sendingAMessage(message: WeatherStationStats) {
        if (message is Temperature)
            println("Сегодня ${message.degrees} градусов")
        if (message is PrecipitationAmount)
            println("Сегодня выпало ${message.precipitation}мм осадков")
    }
}
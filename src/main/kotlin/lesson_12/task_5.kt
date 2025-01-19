package org.example.lesson_12

import kotlin.random.Random

fun main() {
    val listOfWeatherConditions: ArrayList<WeatherFive> = arrayListOf()

    for (i in 1 until 31) {
        val day = WeatherFive(
            daytimeTemperature = 10.rangeTo(20).random(),
            nightTemperature = 0.rangeTo(10).random(),
            isPresenceOfPrecipitation = Random.nextBoolean()
        )
        listOfWeatherConditions.add(day)
    }
    val listOfDaytimeTemperatures = listOfWeatherConditions.map { it.daytimeTemperature }
    val averageDailyTemperatures = listOfDaytimeTemperatures.average()
    val listOfNightTemperatures = listOfWeatherConditions.map { it.nightTemperature }
    val averageNightTemperatures = listOfNightTemperatures.average()
    val listOfRainyDays = listOfWeatherConditions.map { it.isPresenceOfPrecipitation }
    val numberOfRainyDaysMap = listOfRainyDays.map {
        if (it)
            1
        else
            0
    }
    val numberOfRainyDays = numberOfRainyDaysMap.sum()
    println(
        "Дневные температуры: $listOfDaytimeTemperatures\n" +
                "Среднее значение дневных температур: $averageDailyTemperatures\n" +
                "Ночные температуры: $listOfNightTemperatures\n" +
                "Седнее значение ночных температур:$averageNightTemperatures\n" +
                "Количество дней с осадками:$numberOfRainyDays"
    )

}

class WeatherFive(daytimeTemperature: Int, nightTemperature: Int, isPresenceOfPrecipitation: Boolean) {
    val daytimeTemperature = daytimeTemperature
    val nightTemperature = nightTemperature
    val isPresenceOfPrecipitation = isPresenceOfPrecipitation

}
package org.example.lesson_1_10.lesson_5

fun main() {
    val travelDistance = readln().toDouble()
    val fuelConsumptionPerHundredKm = readln().toDouble()
    val pricePerLiter = readln().toDouble()
    val fuel = travelDistance * fuelConsumptionPerHundredKm / 100
    val price = fuel * pricePerLiter
    println("Количество неоходимого топлива: $fuel\nИтоговая стоимость поездки: ${String.format("%.2f", price)}")
}
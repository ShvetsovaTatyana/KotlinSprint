package org.example.lesson_2

const val MINUTES_IN_HOURS = 60
fun main() {
    val hour: Int = 9
    val minute: Int = 39
    val hourToMinutes: Int = (9 * MINUTES_IN_HOURS) + 39
    val travelTimeMinute: Int = 457
    val justMinutes: Int = hourToMinutes + travelTimeMinute
    val conversionToHours: Int = justMinutes / MINUTES_IN_HOURS
    val minutesForCalculation = conversionToHours * MINUTES_IN_HOURS
    val minutesOfArrival = justMinutes - minutesForCalculation
    println("$conversionToHours:$minutesOfArrival")
}
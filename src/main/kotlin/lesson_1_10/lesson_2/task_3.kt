package org.example.lesson_1_10.lesson_2

const val MINUTES_IN_HOURS = 60
fun main() {
    val hour: Int = 9
    val minute: Int = 39
    val hourToMinutes: Int = hour * MINUTES_IN_HOURS + minute
    val travelTimeMinute: Int = 457
    val justMinutes: Int = hourToMinutes + travelTimeMinute
    val conversionToHours: Int = justMinutes / MINUTES_IN_HOURS
    val minutesOfArrival = justMinutes % MINUTES_IN_HOURS
    println("$conversionToHours:$minutesOfArrival")
}
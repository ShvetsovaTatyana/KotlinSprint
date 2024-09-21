package org.example.lesson_4

const val TOTAL_TABLES = 13

fun main() {
    val tableReservationsForToday = 13
    val remainingFreeTables = 4

    val reservedTablesForTomorrow = TOTAL_TABLES - remainingFreeTables
    val isFreeTablesForToday: Boolean = tableReservationsForToday < TOTAL_TABLES
    val isFreeTablesForTomorrow: Boolean = reservedTablesForTomorrow < TOTAL_TABLES

    println("Доступность столиков на сегодня:$isFreeTablesForToday\nДоступность столиков на завтра:$isFreeTablesForTomorrow")
}
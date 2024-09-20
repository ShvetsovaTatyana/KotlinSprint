package org.example.lesson_4

fun main() {
    val totalTables = 13
    val tableReservationsForToday = 13
    val remainingFreeTables = 4
    val reservedTablesForTomorrow = totalTables - remainingFreeTables
    val freeTablesForToday: Boolean = tableReservationsForToday < totalTables
    val freeTablesForTomorrow: Boolean = reservedTablesForTomorrow < totalTables
    println("Доступность столиков на сегодня:$freeTablesForToday\nДоступность столиков на завтра:$freeTablesForTomorrow")
}
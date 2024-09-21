package org.example.lesson_4

fun main() {
    val trainingDay = 6
    val evenDayOfTheWeek = trainingDay % 2 == 0

    println(
        """Упражнения для рук:     ${!evenDayOfTheWeek}
Упражнения для ног:     $evenDayOfTheWeek
Упражнения для спины:   $evenDayOfTheWeek
Упражнения для пресса:  ${!evenDayOfTheWeek}
""".trimMargin()
    )
}
package org.example.lesson_1_10.lesson_1

const val TIMING = 60
fun main() {
    val second: Int = 6480
    val minuteTotal: Int = second / TIMING
    val hour: Int = minuteTotal / TIMING
    val minute: Int = minuteTotal - hour * TIMING
    val secondRemainder: Int = second % TIMING
    println("%02d:%02d:%02d".format(hour, minute, secondRemainder))
}
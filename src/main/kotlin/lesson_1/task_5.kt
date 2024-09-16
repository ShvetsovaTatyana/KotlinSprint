package org.example.lesson_1

fun main() {
    val second: Int = 6480
    val minuteTotal: Int = second / 60
    val hour: Int = minuteTotal / 60
    val minute: Int = minuteTotal - hour * 60
    val secondRemainder: Int = second % 60
    print(String.format("%02d", hour))
    print(":")
    print(String.format("%02d", minute))
    print(":")
    print(String.format("%02d", secondRemainder))
}
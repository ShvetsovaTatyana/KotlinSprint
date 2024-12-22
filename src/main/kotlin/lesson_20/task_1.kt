package org.example.lesson_20

fun main() {
    val username = "Илюшка"
    val welcome: () -> String = { "С наступающим Новым Годом, $username" }
    println(welcome())
}
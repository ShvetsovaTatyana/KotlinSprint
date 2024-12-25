package org.example.lesson_21

fun main() {
    val string = "hello"
    println(string.vowelCount())
}

fun String.vowelCount(): Int {
    val vowelArray = arrayOf('A', 'E', 'I', 'O', 'U', 'Y', 'a', 'e', 'i', 'o', 'u', 'y')
    var sum = 0
    for (i in this) {
        if (vowelArray.contains(i))
            sum = sum + 1
    }
    return sum
}
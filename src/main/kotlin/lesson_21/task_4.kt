package org.example.lesson_21

import java.io.File

fun main() {
    val file = File("textFile.txt")
    file.createNewFile()
    file.writeText("Hello")
    file.addText(word = "Cat")
}

fun File.addText(word: String) {
    val text = this.readText()
    this.writeText("")
    this.writeText(word.lowercase())
    this.appendText(text)
}
package org.example.lesson_17

fun main() {
    val image = Image("Копии документов", 10, false)
    println("${image.name}\n${image.numberOfFiles}")
}

class Image(name: String, numberOfFiles: Int, isSecrecy: Boolean) {
    var name: String = name
        get() = if (isSecrecy) "Скрытая папка" else field
    var numberOfFiles: Int = numberOfFiles
        get() = if (isSecrecy) 0 else field

    val isSecrecy: Boolean = isSecrecy
}
package org.example.lesson_17

fun main() {
    val image = Image("Копии документов", 10, false)
    println("${image.name}\n${image.numberOfFiles}")
}

class Image(name: String, numberOfFiles: Int, isSecrecy: Boolean) {
    var name: String = name
        get() {
            if (isSecrecy) {
                val hiddenFolder = "Скрытая папка"
                return hiddenFolder
            } else
                return field
        }
    var numberOfFiles: Int = numberOfFiles
        get() {
            if (isSecrecy)
                return 0
            else
                return field
        }
    val isSecrecy: Boolean = isSecrecy
}
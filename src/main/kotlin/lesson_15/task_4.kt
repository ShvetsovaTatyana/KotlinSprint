package org.example.lesson_15

interface Search {
    fun search(): String
}

open class Product(
    val name: String,
    val numberOfUnitsInStock: Int,
)

class MusicalInstrument(
    name: String, numberOfUnitsInStock: Int, val stringInstruments: Int, val windInstruments: Int
) : Product(name, numberOfUnitsInStock), Search {
    override fun search(): String {
        return "Выполняется поиск"
    }
}

class Accessories(
    name: String, numberOfUnitsInStock: Int, val forKeyboardInstruments: String
) : Product(name, numberOfUnitsInStock)
package org.example.lesson_15

interface Search {
    fun search(): String
}

open class MusicStore(
    val name: String,
    val numberOfUnitsInStock: Int,
) : Search {
    override fun search(): String {
        return "Выполняется поиск"
    }

}

class MusicalInstruments(
    name: String, numberOfUnitsInStock: Int, val stringInstruments: Int, val windInstruments: Int
) : MusicStore(name, numberOfUnitsInStock)

class Accessories(
    name: String, numberOfUnitsInStock: Int, val forKeyboardInstruments: String
) : MusicStore(name, numberOfUnitsInStock)
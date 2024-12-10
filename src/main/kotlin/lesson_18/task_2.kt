package org.example.lesson_18

fun main() {
    val diceOne = FourSidedBone()
    val diceTwo = SixSidedBone()
    val diceTree = EightSidedBone()
    val listOfDice: List<Dice> = listOf(diceOne, diceTwo, diceTree)

    for (i in listOfDice) {
        i.throwADice()
    }
}

open class Dice(val numberOfFaces: Int) {
    open fun throwADice() {
        val throwADice = (1..numberOfFaces).random()
        println(throwADice)
    }
}

class FourSidedBone() : Dice(4)

class SixSidedBone() : Dice(6)

class EightSidedBone() : Dice(8)

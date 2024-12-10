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

open class Dice() {
    open fun throwADice() {

    }
}

class FourSidedBone() : Dice() {
    override fun throwADice() {
        val throwADice = (1..4).random()
        println(throwADice)
    }
}

class SixSidedBone() : Dice() {
    override fun throwADice() {
        val throwADice = (1..6).random()
        println(throwADice)
    }
}

class EightSidedBone() : Dice() {
    override fun throwADice() {
        val throwADice = (1..8).random()
        println(throwADice)
    }
}
package org.example.lesson_10

fun main() {
    var winningRounds = 0
    var answer = ""
    do {
        winningRounds += holdingARound()
        println("Хотите бросить кости еще раз? Введите Да или Нет")
        answer = readln()
    } while (answer == "Да")
    println("Игра окончена. Вы выиграли:$winningRounds ")
}

fun holdingARound(): Int {
    var winningRounds = 0
    val numberComputer = generatingDiceValues()
    println("Кубик бросил компьютер. Значение на кубике:$numberComputer")
    val numberPlayer = playerThrowsCube()
    println("Кубик бросил игрок. Значение на кубике:$numberPlayer")
    if (numberComputer == numberPlayer)
        println("Победила дружба")
    if (numberComputer > numberPlayer)
        println("Победила машина")
    if (numberPlayer > numberComputer) {
        println("Победило человечество")
        winningRounds = winningRounds + 1
    }
    return winningRounds
}

fun generatingDiceValues(): Int {
    val numberRandom = 1.rangeTo(5).random()
    return numberRandom
}

fun playerThrowsCube(): Int {
    val numberPlayer = readln().toInt()
    return numberPlayer
}
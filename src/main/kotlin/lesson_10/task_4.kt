package org.example.lesson_10

fun main() {
    var winningRounds = 0
    var answer = ""
    do {
        winningRounds += holdingARound()
        println("Хотите бросить кости еще раз? Введите Да или Нет")
        answer = readln()
    } while (answer.equals("да", true))
    println("Игра окончена. Вы выиграли:$winningRounds ")
}

fun holdingARound(): Int {
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
        return 1
    }
    return 0
}

fun generatingDiceValues(): Int {
    val numberRandom = 1.rangeTo(5).random()
    return numberRandom
}

fun playerThrowsCube(): Int {
    val numberPlayer = 1.rangeTo(5).random()
    return numberPlayer
}
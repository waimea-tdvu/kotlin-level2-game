/**
 * =====================================================================
 * Programming Project for NCEA Level 2, Standard 91896
 * ---------------------------------------------------------------------
 * Project Name:   CHAIN REACTION
 * Project Author: TRINH VU
 * GitHub Repo:    GITHUB REPO URL HERE
 * ---------------------------------------------------------------------
 * Notes:
 * PROJECT NOTES HERE
 * =====================================================================
 */


val boards= mutableListOf<String>()

fun main() {
        println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓".cyan())
        print("┃".cyan())

        print(" Welcome to Chain Reaction Game")
        println(" ┃".cyan())
        print("┃".cyan())
        print(" Produce by Trinh Vu ")
        println("           ┃".cyan())

        println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛".cyan())
        println()

        getPlayer1Name()
        getPlayer2Name()
        createBoard()

        while (true) {
            showBoard()
            getUser1Movement()

            showBoard()
            getUser2Movement()
        }

    }
    var player1Symbol = ""
    var player2Symbol = ""
// Symbol P1 ♔♕⚐♡♢♤♧
// Symbol P2 ♚♛⚑♥♦♠♣
fun getPlayer1Name() {
    // Get user 1 name

    print(" Enter player 1 name here : ")
    val name1 = readln()
    var choice1: Int?
    val symbol1: String

    while (true) {
        // Get user 1 symbol
        println("1.♔")
        println("2.♕")
        println("3.⚐")
        println("4.♡")
        println("5.♢")
        println("6.♤")
        println("7.♧")
        println("Choose player 1 symbol to play: ")
        choice1 = readlnOrNull()?.toIntOrNull()
        if (choice1 !in 1..7) {
            println("PLEASE CHOOSE NUMBER FROM 1 TO 7!!")
            continue
        }

        symbol1 = when (choice1) {
            1 -> "♔"
            2 -> "♕"
            3 -> "⚐"
            4 -> "♡"
            5 -> "♢"
            6 -> "♤"
            7 -> "♧"
            else -> ""
        }
        break
    }
        println("Player 1: $name1 $symbol1 ")
        player1Symbol = symbol1
    }

fun getPlayer2Name() {
    // get user 2 name
    print(" Enter player 2 name here : ")
    val name2 = readln()
    var choice2: Int?
    val symbol2: String
    // Get user 2 symbol
    while (true) {
    println("1.♚")
    println("2.♛")
    println("3.⚑")
    println("4.♥")
    println("5.♦")
    println("6.♠")
    println("7.♣")
    println("Choose player 2 symbol to play: ")
    choice2 = readlnOrNull()?.toIntOrNull()
    if (choice2 !in 1..7) {
        println("PLEASE CHOOSE NUMBER FROM 1 TO 7!!")
        continue
    }
    symbol2 = when (choice2) {
        1 -> "♚"
        2 -> "♛"
        3 -> "⚑"
        4 -> "♥"
        5 -> "♦"
        6 -> "♠"
        7 -> "♣"
        else -> ""
    }
    break
}
            println("Player 2: $name2 $symbol2")
            player2Symbol = symbol2
        }

// Create the  board
fun createBoard() {
    repeat(12) {
           boards.add("")
   }
}
// Show the board
fun showBoard(){
    for (i in 1..boards.size) {
        print("    $i    ")
    }
    println()
    // Top border
    println("┏━━━━━━━━".green() + "┳━━━━━━━━".repeat(boards.size - 1).green() + "┓".green())

    // Board  contents

    for (board in boards) {
        print("┃".green())
        print(" ${board.padEnd(6)} ")

    }
    println("┃".green())

    // Bottom border

    println("┗━━━━━━━━".green() + "┻━━━━━━━━".repeat(boards.size - 1).green() + "┛".green())
}

fun getUser1Movement() {
    while (true) {
        var position: Int?
        while (true) {
            print("Player 1, where to place your counter: ")
            position = readlnOrNull()?.toIntOrNull()
            if (position != null && position in 1..12) break
        }

        val index = position!! - 1


        if (boards[index] == "") {
            boards[index] = player1Symbol
            break
        } else {
            println("THIS SPACE HAS BEEN USED!!!")
        }
    }
}
fun getUser2Movement() {
    while (true) {
        var position: Int?
        while (true) {
            print("Player 2, where to place your counter: ")
            position = readlnOrNull()?.toIntOrNull()
            if (position != null && position in 1..12) break
        }

        val index = position!! - 1


        if (boards[index] == "") {
            boards[index] = player2Symbol
            break
        } else {
            println("THIS SPACE HAS BEEN USED!!!")
        }
    }
}
fun explodeChain(){

}








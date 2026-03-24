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

        getPlayerName()
        createBoard()
        showBoard()
        getUserSelection()


    }
// Symbol P1 ♔♕⚐♡♢♤♧
// Symbol P2 ♚♛⚑♥♦♠♣
fun getPlayerName(){
    // Get username

    print(" Enter player name here : ")
    val name1 = readln()

        println("1.♔")
        println("2.♕")
        println("3.⚐")
        println("4.♡")
        println("5.♢")
        println("6.♤")
        println("7.♧")
        println("Choose player 1 symbol to play: ")

    var symbol1 = readln()
        when {
            symbol1 == "1"-> symbol1 = "♔"
            symbol1 == "2"-> symbol1 = "♕"
            symbol1 == "3"-> symbol1 = "⚐"
            symbol1 == "4"-> symbol1 = "♡"
            symbol1 == "5"-> symbol1 = "♢"
            symbol1 == "6"-> symbol1 = "♤"
            symbol1 == "7"-> symbol1 = "♧ "

        }
    println("Player 1: $name1 $symbol1 ")


    print(" Enter player 2 name here : ")
    val name2 = readln()

    println("1.♚")
    println("2.♛")
    println("3.⚑")
    println("4.♥")
    println("5.♦")
    println("6.♠")
    println("7.♣")
    println("Choose player 2 symbol to play: ")

    var symbol2 = readln()
    when {
        symbol2 == "1"-> symbol2 = "♚"
        symbol2 == "2"-> symbol2 = "♛"
        symbol2 == "3"-> symbol2 = "⚑"
        symbol2 == "4"-> symbol2 = "♥"
        symbol2 == "5"-> symbol2 = "♦"
        symbol2 == "6"-> symbol2 = "♠"
        symbol2 == "7"-> symbol2 = "♣"
    }

    println("Player 2: $name2 $symbol2")

}

fun createBoard() {
    repeat(12) {
           boards.add("SPACE")
   }
}

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

fun getUserSelection() {
    var movement: String
    while (true) {
        print("Choose number player 1 move:  ")
        movement = readln()
        if (movement.isNotBlank()) break
    }
    var movementAdded = false
    for (i in 0..<boards.size) {
        if (boards[i] == "SPACE") {
            boards[i] = movement
            movementAdded = true
            break
        }
    }

    if (!movementAdded) {
        println("INVALID MOVE")
    }
}






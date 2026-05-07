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

// global variable and value
val boards = mutableListOf<String>()
var player1Name = ""
var player2Name = ""
var player1Symbol = ""
var player2Symbol = ""
var EMPTY = " "
var placement1 = 0
var placement2 = 0
var p1Points = 0
var p2Points = 0
fun main() {
    // Create Introduction to the game--------------------------------------------------------------
    println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓".cyan())
    print("┃".cyan())

    print(" Welcome to Chain Reaction Game")
    println(" ┃".cyan())
    print("┃".cyan())
    print(" Produce by Trinh Vu ")
    println("           ┃".cyan())

    println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛".cyan())
    println()

    getPlayer1Information()
    getPlayer2Information()
    createBoard()

    while (true) {
        showBoard()
        getUser1Movement()
        checkDefuseRule1()
        checkExplosion1()
        println("$player1Name SCORE: $p1Points.".red())
        if (checkWinner()) {
            break
        }


        showBoard()
        getUser2Movement()
        checkDefuseRule2()
        checkExplosion2()
        println("$player2Name SCORE $p2Points.".red())
        if (checkWinner()) {
            break
        }
    }
}

// Create the  board----------------------------------------------------------------------------------------
fun createBoard() {
    repeat(12) {
        boards.add(EMPTY)
    }
}

// Show the board-----------------------------------------------------
fun showBoard() {
    // Show number index above the board--------------------------------------------------
    for (i in 1..boards.size) {
        if (i < 11) {
            print("    $i    ")
        } else {
            print("   $i    ")
        }
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

// Get name and symbol for P1 to play-----------------------------------------------
fun getPlayer1Information() {
    // Get user 1 name
    while (true) {
        print(" Enter player 1 name here : ")
        val name1 = readln()
        player1Name = name1
        if (name1.isNotBlank()) break
    }
    var choice1: Int?
    val symbol1: String

    while (true) {
        // Get user 1 symbol
        println("1.○")
        println("2.◎")
        println("3.◇")
        println("4.△")
        println("Choose player 1 symbol to play: ")
        choice1 = readlnOrNull()?.toIntOrNull()
        if (choice1 !in 1..4) {
            println("PLEASE CHOOSE NUMBER FROM 1 TO 4!!")
            continue
        }
        symbol1 = when (choice1) {
            1 -> "○"
            2 -> "◎"
            3 -> "◇"
            4 -> "△"
            else -> ""
        }
        break
    }
    println("Player 1: $player1Name $symbol1 ")
    player1Symbol = symbol1
}

// Get name and symbol for P2 to play-----------------------------------------------
fun getPlayer2Information() {
    // get user 2 name
    while (true) {
        print(" Enter player 2 name here : ")
        val name2 = readln()
        player2Name = name2
        if (name2.isNotBlank()) break
    }
    var choice2: Int?
    val symbol2: String
    // Get user 2 symbol
    while (true) {
        println("1.●")
        println("2.◉")
        println("3.◆")
        println("4.▲")
        println("Choose player 2 symbol to play: ")
        choice2 = readlnOrNull()?.toIntOrNull()
        if (choice2 !in 1..4) {
            println("PLEASE CHOOSE NUMBER FROM 1 TO 4!!")
            continue
        }
        symbol2 = when (choice2) {
            1 -> "●"
            2 -> "◉"
            3 -> "◆"
            4 -> "▲"
            else -> ""
        }
        break
    }
    println("Player 2: $player2Name $symbol2")
    player2Symbol = symbol2
}

// Get player 1 movement
fun getUser1Movement() {
    while (true) {
        var position: Int?
        while (true) {
            print("Player 1, where to place your counter: ")
            position = readlnOrNull()?.toIntOrNull()
            if (position != null && position in 1..12) break
        }

        val index = position!! - 1
        if (index < boards.size - 1 && index >= 0 && boards[index + 1] == player2Symbol && boards[index - 1] == player2Symbol) {
            println("You can't place your counter here!!!")
            continue
        }
        if (boards[index] == EMPTY) {
            boards[index] = player1Symbol
            placement1 = position
            break
        } else {
            println("THIS SPACE HAS BEEN USED!!!")
        }
    }
}

// Get player 2 movement
fun getUser2Movement() {
    while (true) {
        var position: Int?
        while (true) {
            print("Player 2, where to place your counter: ")
            position = readlnOrNull()?.toIntOrNull()
            if (position != null && position in 1..12) break
        }

        val index = position!! - 1
        if (index < boards.size - 1 && index >= 0 && boards[index + 1] == player1Symbol && boards[index - 1] == player1Symbol) {
            println("You can't place your counter here!!!")
            continue
        }
        if (boards[index] == EMPTY) {
            boards[index] = player2Symbol
            placement2 = position
            break
        } else {
            println("THIS SPACE HAS BEEN USED!!!")
        }

    }
}

// Check and explode the counter----------------------------------------------------------------------
fun checkExplosion1() {
    var totalCounter = 1  // We have just placed one counter
    val index = placement1 - 1
    var right = index + 1
    while (right < boards.size && boards[right] == player1Symbol) {
        totalCounter++
        right++
    }
    var left = index - 1
    while (left >= 0 && boards[left] == player1Symbol) {
        totalCounter++
        left--
    }

    if (totalCounter >= 3) {
        p1Points += totalCounter
        for (counter1 in right - 1 downTo left + 1) {
            boards[counter1] = EMPTY
        }
        println("BOOM!!!")
    }
}

fun checkExplosion2() {
    var totalCounter2 = 1
    val index = placement2 - 1
    var right = index + 1
    while (right < boards.size && boards[right] == player2Symbol) {
        totalCounter2++
        right++
    }
    var left = index - 1
    while (left >= 0 && boards[left] == player2Symbol) {
        totalCounter2++
        left--
    }

    if (totalCounter2 >= 3) {
        p2Points += totalCounter2
        for (counter2 in right - 1 downTo left + 1) {
            boards[counter2] = EMPTY
        }
        println("BOOM!!!")
    }
}

// Defuse rule :if any opponent bomb now has one of your bombs on each side, it is ‘defused’ and removed from the board (note: two bombs can be defused in one go)----------------------------------------
fun checkDefuseRule1() {
    val index = placement2 - 1
    if (index < boards.size - 1 && index >= 0 && boards[index + 1] == player1Symbol && boards[index - 1] == player1Symbol) {
        boards[index] = EMPTY
        println("YOUR BOMB HAS BEEN DEFUSED!!!")
    }
}

fun checkDefuseRule2() {
    val index = placement1 - 1
    if (index < boards.size - 1 && index >= 0 && boards[index + 1] == player2Symbol && boards[index - 1] == player2Symbol) {
        boards[index] = EMPTY
        println("YOUR BOMB HAS BEEN DEFUSED!!!")
    }
}

fun checkWinner(): Boolean {
    if (p1Points >= 10) {
        println("WINNER WINNER CHICKEN DINNER!!!")
        println("CONGRATULATION $player1Name!!!")
        return true
    }
    if (p2Points >= 10) {
        println("WINNER WINNER CHICKEN DINNER!!!")
        println("CONGRATULATION $player2Name!!!")
        return true
    }
    return false
}










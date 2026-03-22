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
        boardSelection()


    }
fun getPlayerName(){
    // Get username
    print(" Player 1, enter your name here : ")
    val name1 = readln()
    println("Player 1: $name1 ")
    print(" Player 2, enter your name here : ")
    val name2 = readln()
    println("Player 2: $name2 ")

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

fun boardSelection(){
    
}






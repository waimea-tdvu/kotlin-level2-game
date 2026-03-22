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

        createBoard()
        showBoard()
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
    println("┏━━━━━━━━" + "┳━━━━━━━━".repeat(boards.size - 1) + "┓")


    // Cell contents

    for (board in boards) {
        print("┃")
        print(" ${board.padEnd(6)} ")

    }
    println("┃")

    // Bottom border

    println("┗━━━━━━━━" + "┻━━━━━━━━".repeat(boards.size - 1) + "┛")
}

fun



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


val board= mutableListOf<String>()



fun main() {
    println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓".cyan())
      print("┃".cyan())
    println(" Welcome to Chain Reaction Game")

//    println(" Produce by Trinh Vu           ")
//    print("┃".cyan())
//    println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛".cyan())
    println()

    createBoard()
}
fun createBoard() {
    repeat(12) {
    board.add("SPACE")
   }
}


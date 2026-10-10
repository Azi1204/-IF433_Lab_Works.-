package oop_164021_AziAprianto.Week07

object GameManager {
    var isGameRunning: Boolean = false
    fun startGame() {
        if (isGameRunning) {
            println("Game sudah berjalan! Mencegah instansiasi ganda.")
        } else {
            isGameRunning = true
            println("Memulai Game Engine...")
        }
    }
}
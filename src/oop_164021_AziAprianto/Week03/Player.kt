package oop_164021_AziAprianto.Week03

class Player(val username: String) {

    private var xp: Int = 0

    val level: Int
        get() = (xp / 100) + 1

    fun addXp(amount: Int) {
        if (amount > 0) {
            val previousLevel = this.level
            xp += amount

            if (this.level > previousLevel) {
                println("Level Up! Selamat $username naik ke level $level")
            }
        } else {
            println("ERROR: XP yang ditambahkan harus angka positif.")
        }
    }
}
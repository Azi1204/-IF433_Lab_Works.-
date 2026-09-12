package oop_164021_AziAprianto.Week03

fun main() {
    println("--- TEST TUGAS 2: PLAYER LEVELING ---")
    val p1 = Player("GamerSejati")

    println("\nMenambah 50 XP...")
    p1.addXp(50)
    println("Status -> Level: ${p1.level}")

    // Tambah 60 XP (Total 110, Level harus naik ke 2)
    println("\nMenambah 60 XP...")
    p1.addXp(60)
    println("Status -> Level: ${p1.level}")
}
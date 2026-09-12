package oop_164021_AziAprianto.Week03

fun main() {
    println("--- TEST TUGAS 1: WEAPON ---")
    val sword = Weapon("Excalibur")

    println("Mencoba set damage ke -50...")
    sword.damage = -50
    println("Damage saat ini: ${sword.damage}")

    println("\nMencoba set damage ke 9999...")
    sword.damage = 9999
    println("Damage saat ini: ${sword.damage}")

    println("\nSenjata ${sword.name} memiliki Tier: ${sword.tier}")
}

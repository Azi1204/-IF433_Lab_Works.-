package oop_164021_AziAprianto.week02
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    print("Masukkan Nama Hero: ")
    val name = scanner.nextLine()
    print("Masukkan Base Damage Hero: ")
    val damage = scanner.nextInt()

    val hero = Hero(name, damage)
    var enemyHp = 100
    val enemyName = "Dark Lord"

    while (hero.isAlive() && enemyHp > 0) {
        println("\n--- Tentukan Aksi ---")
        println("1. Serang\n2. Kabur")
        print("Pilihan: ")
        val action = scanner.nextInt()

        if (action == 1) {
            hero.attack(enemyName)
            enemyHp -= hero.baseDamage
            println("Sisa HP $enemyName: $enemyHp")

            if (enemyHp > 0) {
                println("$enemyName membalas!")
                val randomDamage = (10..20).random()
                hero.takeDamage(randomDamage)
                println("Sisa HP ${hero.name}: ${hero.hp}")
            }
        } else if (action == 2) {
            println("${hero.name} melarikan diri!")
            break
        } else {
            println("Input tidak valid.")
        }
    }

    println("\n--- Hasil Pertarungan ---")
    if (!hero.isAlive()) {
        println("${hero.name} telah dikalahkan!")
    } else if (enemyHp <= 0) {
        println("$enemyName berhasil dikalahkan!")
    } else {
        println("Pertarungan belum selesai.")
    }
}

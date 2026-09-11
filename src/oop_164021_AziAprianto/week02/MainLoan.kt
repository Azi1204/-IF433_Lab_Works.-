package oop_164021_AziAprianto.week02
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    print("Masukkan Judul Buku: ")
    val title = scanner.nextLine()
    print("Masukkan Nama Peminjam: ")
    val borrower = scanner.nextLine()
    print("Masukkan Lama Pinjam (hari): ")
    var duration = scanner.nextInt()

    if (duration < 0) {
        println("Durasi tidak valid. Diubah otomatis menjadi 1 hari.")
        duration = 1
    }

    val loan = Loan(title, borrower, duration)
    println("\n--- Detail Peminjaman ---")
    println("Buku: ${loan.bookTitle}")
    println("Peminjam: ${loan.borrower}")
    println("Total Denda: Rp ${loan.calculateFine()}")
}

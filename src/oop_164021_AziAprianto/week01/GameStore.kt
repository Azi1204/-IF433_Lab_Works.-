package oop_164021_AziAprianto.week01

fun main() {
    val gameTitle = "GTA VI"
    val price = 750000

    val finalPrice = calculateDiscount(price)

    println("Harga Asli: $price")
    printReceipt(title = gameTitle, finalPrice = finalPrice)

    val userNote: String? = null
    println("Catatan: ${userNote ?: "Tidak ada catatan"}")
}

fun calculateDiscount(price: Int): Int =
    if (price > 500000) price - (price * 20 / 100) else price - (price * 10 / 100)

fun printReceipt(title: String, finalPrice: Int) {
    println("Judul: $title")
    println("Harga Akhir: $finalPrice")
}



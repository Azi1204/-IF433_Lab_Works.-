package oop_164021_AziAprianto.week01

fun main() {
    val gameTitle = "GTA VI"
    val price = 750000

    val finalPrice = calculateDiscount(price)
}

fun calculateDiscount(price: Int): Int =
    if (price > 500000) price - (price * 20 / 100) else price - (price * 10 / 100)



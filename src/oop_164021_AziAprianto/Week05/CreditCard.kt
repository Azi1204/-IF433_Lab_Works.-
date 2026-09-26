package oop_164021_AziAprianto.Week05

class CreditCard(accountName: String, val limit: Double) : PaymentMethod(accountName) {
    var usedAmount: Double = 0.0

    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("Sukses! Pembayaran berhasil. Limit terpakai saat ini: $usedAmount")
        } else {
            println("Transaksi ditolak. Melebihi limit kartu kredit!")
        }
    }
}
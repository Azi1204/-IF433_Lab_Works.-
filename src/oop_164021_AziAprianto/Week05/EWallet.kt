package oop_164021_AziAprianto.Week05

class EWallet(accountName: String, var balance: Double) : PaymentMethod(accountName) {
    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("Sukses! Pembayaran berhasil. Sisa saldo EWallet: $balance")
        } else {
            println("Saldo tidak cukup")
        }
    }

    fun topUp(amount: Double) {
        balance += amount
        println("Top Up berhasil. Saldo EWallet saat ini: $balance")
    }
}
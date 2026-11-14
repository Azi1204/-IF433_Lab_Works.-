package oop_164021_AziAprianto.Week10

fun main() {
    val coinRepo = WalletRepository<Coin>()
    coinRepo.add(Coin("BTC", 0.75))
    coinRepo.add(Coin("ETH", 4.2))
    coinRepo.add(Coin("USDT", 1500.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())

    println("=== CRYPTO DASHBOARD ===")
    println("Status: ${response.status}")
    response.data.forEach {
        println("Koin: ${it.name}, Saldo: ${it.balance}")
    }

    val txRepo = WalletRepository<Transaction>()
    txRepo.add(Transaction("TX-001", 0.1))
    txRepo.add(Transaction("TX-002", 250.0))
    txRepo.add(Transaction("TX-003", 12.5))

    println("\n=== DAFTAR TRANSAKSI ===")
    txRepo.getAll().forEach {
        println("ID: ${it.id}, Jumlah: ${it.amount}")
    }
}
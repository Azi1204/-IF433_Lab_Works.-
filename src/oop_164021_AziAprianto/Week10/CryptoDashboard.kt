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
}
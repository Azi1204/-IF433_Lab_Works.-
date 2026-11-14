package oop_164021_AziAprianto.Week10

fun main() {
    val coinRepo = WalletRepository<Coin>()
    coinRepo.add(Coin("BTC", 0.75))
    coinRepo.add(Coin("ETH", 4.2))
    coinRepo.add(Coin("USDT", 1500.0))
}
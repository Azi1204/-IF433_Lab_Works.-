package oop_164021_AziAprianto.Week10

class WalletRepository<T> {
    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items
    }
    interface Named {
        val name: String
    }

    data class Coin(override val name: String, val balance: Double) : Named

    data class Transaction(val id: String, val amount: Double)
}
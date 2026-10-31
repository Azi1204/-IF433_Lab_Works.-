package oop_164021_AziAprianto.Week08

class ApiParser {
    fun parseProduct(rawJson: Map<String, Any?>): Product? {
        fun checkout(product: Product) {
            val (id, detail) = when (product) {
                is Electronic -> product.id to "${product.name} (Warranty ${product.warrantyMonths})"
                is Clothing -> product.id to "${product.name} (Size ${product.size})"
            }

            val transactionId = JavaPaymentService.processPayment(id)!!
            println("Checkout $detail -> $transactionId")
        }
        val id = requireNotNull(rawJson["id"] as? String) { "API Invalid: Missing ID" }
        val name = requireNotNull(rawJson["name"] as? String) { "API Invalid: Missing Name" }
        val type = rawJson["type"] as? String

        return when (type) {
            "ELECTRONIC" -> {
                val warranty = rawJson["warranty"] as? Int ?: 12
                Electronic(id, name, warranty)
            }
            "CLOTHING" -> {
                val size = rawJson["size"] as? String ?: "All Size"
                Clothing(id, name, size)
            }
            else -> null
        }
    }
}
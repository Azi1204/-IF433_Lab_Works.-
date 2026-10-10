package oop_164021_AziAprianto.Week07

import oop_164021_AziAprianto.Week07.DatabaseManager.connectionStatus

fun main() {
    println("=== TEST SIGLETON ===")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("=== TEST COMPANION OBEJECT ===")
    val client = NetworkClient.createClient()
    client.connect()

    println("\n === TEST REGULAR CLASS === ")
    val reg1 = RegularUser("Alice", 22)
    val reg2 = RegularUser("Alice", 22)
    println(reg1)
    println("Sama? ${reg1 == reg2}")

    println("\n === TEST DATA CLASS === ")
    val data1 = DataUser("Alice", 22)
    val data2 = DataUser("Alice", 22)
    println(data1)
    println("Sama? ${data1 == data2}")

    val data3 = data1.copy(age = 23)
    println("Hasil Copy: $data3")
    val (userName, userAge) = data1
    println("Destructured: $userName berumur $userAge")

    println("\n === TEST SEALED CLASS === ")
    val response: ApiResponse = ApiResponse.Success("Data berhasil ditarik!")
    val uiMessage = when(response) {
        is ApiResponse.Success -> "Tampilkan: ${response.data}"
        is ApiResponse.Error -> "Munculkan alert: ${response.message}"
        ApiResponse.Loading -> "Tampilkan Spinner"
    }
    println(uiMessage)

    println("\n=== TUGAS MANDIRI ===")
    GameManager.startGame()
    GameManager.startGame()

    println("Drop chance LEGENDARY: ${ItemRarity.LEGENDARY.dropChance}%")
    val starterWeapon = Weapon.forgeStarterSword()
    println("Senjata awal: ${starterWeapon.item.name}, " +
            "Damage: ${starterWeapon.item.damage}, " +
            "Durability: ${starterWeapon.durability}")
}
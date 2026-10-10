package oop_164021_AziAprianto.Week07

import oop_164021_AziAprianto.Week07.DatabaseManager.connectionStatus

fun Main() {
    println("=== TEST SIGLETON ===")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("=== TEST COMPANION OBEJECT ===")
    val client = NetworkClient.createClient()
    client.connect()
}
package oop_164021_AziAprianto.Week07

class NetworkClient private constructor(val url: String) {
    fun connect() {
        println("Connecting to $url...")
    }
}
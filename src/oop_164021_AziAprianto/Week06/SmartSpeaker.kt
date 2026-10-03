package oop_164021_AziAprianto.Week06

class SmartSpeaker(override val id: String, override val name: String) : SmartDevice, Switchable {
    override fun turnOn() { println("$name: Speaker aktif.") }
    override fun turnOff() { println("$name: Speaker nonaktif.") }
    fun playMusic(song: String) { println("Memutar lagu $song dari Spotify.") }
}

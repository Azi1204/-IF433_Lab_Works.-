package oop_164021_AziAprianto.Week06

class SmartCCTV(override val id: String, override val name: String) : SmartDevice, Switchable, Recordable {
    override fun turnOn() {
        println("$name: Sistem CCTV menyala.")
        startRecord()
    }

    override fun turnOff() {
        stopRecord()
        println("$name: Sistem CCTV dimatikan.")
    }

    override fun startRecord() { println("$name: Perekaman video dimulai.") }
}
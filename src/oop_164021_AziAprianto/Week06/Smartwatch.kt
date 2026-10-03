package oop_164021_AziAprianto.Week06

class Smartwatch : Watch(), BluetoohtConnectable, Rechargeable {
    override fun showTime() {
        println("Layar OLED menyala : 14:00 WIB")
    }
    override fun connectToBluetooht() {
        println("Mencari perangkat HP di sekitar untuk pairing ...")
    }

    override fun chargeBattery() {
        println("Mengisi daya menggunakan charger magnetik 15W.")
    }
}
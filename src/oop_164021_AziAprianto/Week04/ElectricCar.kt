package oop_164021_AziAprianto.Week04

class electricCar(brand: String, numberOfDoors: Int, val batteryCapacity: Int) : Car(brand, numberOfDoors) {
    final override fun accelerate() {
        println("$brand berakselerasi dalam sunyi.  Kapasitas baterai: $batteryCapacity%.")
    }
}
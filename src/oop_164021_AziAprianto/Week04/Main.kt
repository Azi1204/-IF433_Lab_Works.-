package oop_164021_AziAprianto.Week04

fun main(){
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle(brand = "Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar  = Car(brand = "Toyota", numberOfDoors = 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    println("\n--- Testing ElectricCar ---")
    val myelectricCar = Car(brand = "BMW", numberOfDoors = 4)
    myelectricCar.openTrunk()
    myelectricCar.accelerate()
    myelectricCar.honk()

    println("\n--- Testing Employee hierarchy ---")
    val manager = Manager(name = "Azi", baseSalary = 1000000000)
    manager.work()
    println("Bonus ${manager.name}:Rp ${manager.calculateBonus()}")

    val developer = Developer(name = "Aji", baseSalary = 5000000, progammingLanguage = "Kotlin")
    developer.work()
    println("Bonus ${developer.name}:Rp ${developer.calculateBonus()}")
}

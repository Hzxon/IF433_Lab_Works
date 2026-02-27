package oop_117431_JiroNathanLee.week04

fun main() {
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle("Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car("Toyota", 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    println("\n--- Testing ElectricCar ---")
    val eCar = ElectricCar("Tesla", 4, 100)
    eCar.accelerate()
    eCar.honk()
    eCar.openTrunk()
}
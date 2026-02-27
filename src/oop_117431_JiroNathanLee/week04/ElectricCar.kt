package oop_117431_JiroNathanLee.week04

class ElectricCar(brand: String, numberOfDoors: Int, var batteryCapacity: Int) : Car(brand, numberOfDoors) {

    final override fun accelerate() {
        println("$brand berakselerasi dalam sunyi. Kapasitas baterai: $batteryCapacity.")
    }
}
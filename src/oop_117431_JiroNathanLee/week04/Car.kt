package oop_117431_JiroNathanLee.week04

open class Car(brand: String, val numberOfDoors: Int) : Vehicle(brand) {

    fun openTrunk() {
        println("Bagasi mobile $brand dengan $numberOfDoors pintu dibuka.")
    }
}
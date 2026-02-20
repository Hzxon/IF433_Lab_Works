package oop_117431_JiroNathanLee.week03

fun main() {
    val e = Employee("Budi")

    e.salary = 5_000_000
    println("Gaji ${e.salary}")

    e.increasePerformance()

    println("Pajak yang harus dibayar: ${e.tax}")
}
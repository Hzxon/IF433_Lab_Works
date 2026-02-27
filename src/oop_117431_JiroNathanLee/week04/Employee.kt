package oop_117431_JiroNathanLee.week04

open class Employee(val name: String, val baseSalary: Int) {

    open fun work() = println("$name sedang bekerja.")

    open fun calculateBonus(): Double = baseSalary * 0.1
}
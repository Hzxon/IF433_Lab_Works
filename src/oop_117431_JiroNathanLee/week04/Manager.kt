package oop_117431_JiroNathanLee.week04

class Manager(name: String, baseSalary: Int) : Employee(name, baseSalary) {

    override fun work() = println("$name sedang memimpin rapat divisi.")

    override fun calculateBonus(): Double = super.calculateBonus() + 500_000
}
package oop_117431_JiroNathanLee.week03

fun main() {
    val e = Employee("Budi")

    e.salary = 5_000_000
    println("Gaji ${e.salary}")

    e.increasePerformance()

    println("Pajak yang harus dibayar: ${e.tax}")

    println("\n")

    val w = Weapon("Tono")

    //w.damage = -50
    w.damage = 9999
    println("Damage ${w.damage}")
    println("Tier: ${w.tier}")

    println("\n")

    val p1 = Player("Hzxon")

    //p1.xp --> error
    p1.addXp(50)
    println("Level: ${p1.level}")
    p1.addXp(60)
}
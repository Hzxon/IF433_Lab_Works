package oop_117431_JiroNathanLee.week02

import java.util.Scanner

class Hero (
    val name: String,
    var hp: Int = 100,
    val baseDamage: Int
) {
    fun attack(targetName: String) = println("$name menebas $targetName!")
    fun takeDamage(damage: Int) = if (hp <= damage) hp = 0 else hp -= damage
    fun isAlive() = hp > 0
}

fun main() {
    val scanner = Scanner(System.`in`)

    println("--- MINI RPG BATTLE ---")

    print("Masukkan Nama Hero: ")
    val name = scanner.nextLine()

    print("Masukkan Stat Damage: ")
    var baseDamage = scanner.nextInt()

    scanner.nextLine()

    if (baseDamage < 0) baseDamage = 0

    var enemyHp = 100
    val obj1 = Hero(name, baseDamage = baseDamage)

    while(obj1.isAlive() && enemyHp > 0) {
        println("Menu: 1. Serang, 2. Kabur")
        val choice = scanner.nextInt()
        scanner.nextLine()

        if (choice == 1) {
            obj1.attack("MUSUH")
            enemyHp -= obj1.baseDamage
            println("Sisa HP Musuh: $enemyHp")
            if (enemyHp > 0) {
                println("Musuh Membalas!")
                obj1.takeDamage((10..20).random())
                println("Sisa HP Hero: ${obj1.hp}")
            }
        } else if (choice == 2) {
            println("KABURRR!!!")
            break
        } else println("Input ngawur!")

    }
    val pemenang = if (obj1.hp > enemyHp) obj1.name else "MUSUH"
    println("Pemenang: $pemenang")

}
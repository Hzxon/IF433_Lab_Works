package oop_117431_JiroNathanLee.week02

class Hero (
    val name: String,
    var hp: Int = 100,
    val baseDamage: Int
) {
    fun attack(targetName: String) = println("$name menebas $targetName!")
    fun takeDamage(damage: Int) = if (hp <= damage) hp = 0 else hp -= damage
    fun isAlive() = hp > 0
}
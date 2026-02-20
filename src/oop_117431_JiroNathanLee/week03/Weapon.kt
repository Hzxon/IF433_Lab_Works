package oop_117431_JiroNathanLee.week03

class Weapon(val name: String) {
    var damage: Int = 0
        set(value) {
            if (value < 0) {
                println("Damage tidak boleh negatif!")
            } else if (value > 1000) {
                println("Damage tidak boleh > 1000")
            } else {
                field = value
            }
        }

    val tier: String
        get() = when {
            damage > 800 -> "Legendary"
            damage > 500 -> "Epic"
            else -> "Common"
        }
}
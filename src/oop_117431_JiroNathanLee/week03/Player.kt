package oop_117431_JiroNathanLee.week03

class Player(val username: String) {
    private var xp: Int = 0

    val level: Int
        get() = (xp / 100) + 1

    fun addXp(amount: Int) {
        if (amount > 0) xp += amount
        if (level == 2) println("Level Up! Selamat $username naik ke level $level")
    }
}
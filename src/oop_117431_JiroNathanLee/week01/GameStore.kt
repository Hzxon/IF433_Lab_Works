package oop_117431_JiroNathanLee.week01

fun main() {
    val gameTitle = "Factorio"
    val price = 300_000
    var userNote: String? = null

    printReceipt(title = gameTitle, finalPrice = calculateDiscount(price), note = userNote)
}

fun calculateDiscount(price: Int): Double = if (price > 500_000) price * (1 - 0.2) else price * (1 - 0.1)

fun printReceipt(title: String, finalPrice: Double, note: String?) = println("Game Title: $title, Price: $finalPrice, Note: ${note?: "Tidak ada catatan"}")
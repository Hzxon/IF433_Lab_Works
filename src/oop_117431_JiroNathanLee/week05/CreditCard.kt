package oop_117431_JiroNathanLee.week05

class CreditCard(accountName: String, val limit: Double) : PaymentMethod(accountName) {
    var usedAmount: Double = 0.0

    override fun processPayment(amount: Double) {
        if (usedAmount + amount < limit) {
            usedAmount += amount
            println("CC Success")
        } else {
            println("Transaksi di tolak")
        }
    }
}

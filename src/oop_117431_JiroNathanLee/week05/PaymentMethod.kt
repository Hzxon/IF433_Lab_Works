package oop_117431_JiroNathanLee.week05

abstract class PaymentMethod(val accountName: String) {

    abstract fun processPayment(amount: Double)
}

class EWallet(accountName: String, var balance: Double) : PaymentMethod(accountName) {
    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("Success, sisa saldo: $balance")
        } else {
            println("Saldo tidak cukup.")
        }
    }

    fun topUp(amount: Double) {
        balance += amount
    }
}

class CreditCard(accountName: String, val limit: Double, var usedAmount: Double = 0.0) : PaymentMethod(accountName) {

    override fun processPayment(amount: Double) {
        if (usedAmount + amount < limit) {
            usedAmount += amount
            println("Success")
        } else {
            println("Transaksi di tolak")
        }
    }
}
package oop_117431_JiroNathanLee.week05

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

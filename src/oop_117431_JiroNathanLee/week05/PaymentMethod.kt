package oop_117431_JiroNathanLee.week05

abstract class PaymentMethod(val accountName: String) {

    abstract fun processPayment(amount: Double)
}



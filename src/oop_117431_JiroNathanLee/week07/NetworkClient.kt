package oop_117431_JiroNathanLee.week07

class NetworkClient private constructor(val url: String) {
    fun connect() {
        println("Connecting to $url...")
    }
}
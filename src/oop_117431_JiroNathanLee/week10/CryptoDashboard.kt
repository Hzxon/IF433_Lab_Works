package oop_117431_JiroNathanLee.week10

fun main() {

    val coinRepo = WalletRepository<Coin>()
    coinRepo.add(Coin("BTC", 0.5))
    coinRepo.add(Coin("ETH", 2.5))
    coinRepo.add(Coin("USDT", 100.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())
    println("=== COIN DASHBOARD ===")
    println("Status: ${response.status}")
    response.data.forEach { coin ->
        println("Coin Name: ${coin.name} | Balance: ${coin.balance}")
    }

    val txRepo = WalletRepository<Transaction>()
    txRepo.add(Transaction("TX001", 150.0))
    txRepo.add(Transaction("TX002", 300.0))

    println("\n=== TRANSACTION HISTORY ===")
    txRepo.getAll().forEach { tx ->
        println("ID: ${tx.id} | Amount: ${tx.amount}")
    }
}
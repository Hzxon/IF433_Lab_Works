package oop_117431_JiroNathanLee.week09

fun main() {
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10, -5.2, "OPEN"),
        TradeLog("SOLUSDT", "SHORT", 5, 25.0, "CLOSED"),
        TradeLog("BTCUSDT", "SHORT", 50, -12.0, "CLOSED"),
        TradeLog("BNBUSDT", "LONG", 10, 2.5, "OPEN"),
        TradeLog("LINKUSDT", "SHORT", 20, -1.5, "CLOSED")
    )

    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }
    val winningTrades = closedTrades.filter { it.roe > 0}
}
package oop_117431_JiroNathanLee.week07

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.MonsterEncounter -> println("Awas ada monster ${event.monsterName}!")
        is BattleState.LootDropped -> println("Dapet loot ${event.item.name}, item ${event.item.rarity}")
        is BattleState.GameOver -> println("Game Over! Kamu ${event.reason}")
        is BattleState.SafeZone -> println("Berada di Safe Zone.")
    }
}
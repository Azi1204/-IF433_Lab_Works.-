package oop_164021_AziAprianto.Week07

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.MonsterEncounter -> println("Bertemu dengan monster: ${event.monsterName}")
        is BattleState.LootDropped -> {
            val (name, damage, rarity) = event.item
            println("Mendapat loot: $name (Rarity: $rarity, Damage: $damage)")
        }
        is BattleState.GameOver -> println("Game Over! Alasan: ${event.reason}")
        BattleState.SafeZone -> println("Berada di zona aman.")
    }
}
package oop_164021_AziAprianto.Week09

fun main() {
    println("=== TEST LIST ===")

    val frameworks: List<String> = listOf("Kotlin", "Java", "C++")

    println("Immutable List: $frameworks")

    val scores: MutableList<Int> = mutableListOf(85, 98)
    scores.add(95)
    scores[0] = 88
    println("Mutable List: $scores")
}
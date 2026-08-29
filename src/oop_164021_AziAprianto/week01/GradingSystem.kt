package oop_164021_AziAprianto.week01

fun main() {
    val name: String = "Jhon Thor"
    val score: Int = 80
    val studentId: String? = null
    val idLength: Int = studentId?.length ?: 0

    println("Nama: $name, Nilai: $score")
    val grade = when (score) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
    println("Grade kamu: $grade")
    println("Status: ${calculatestatus(score)}")
    println("Panjang ID: $idLength")
}

fun calculatestatus(score: Int) = if (score > 75) "Lulus" else "Tidak Lulus"
fun main() {
    val subjects = listOf("Bahasa Indonesia", "Bahasa Inggris", "Matematika", "IPA")
    val scores = mutableListOf<Double>()

    for (subject in subjects) {
        var score: Double?
        do {
            print("Masukkan nilai untuk $subject: ")
            score = readLine()?.toDoubleOrNull()
            if (score == null || score !in 0.0..100.0) {
                println("Nilai harus berupa angka antara 0 dan 100.")
                score = null
            }
        } while (score == null)
        scores.add(score)
    }

    val average = scores.average()
    val grade = when {
        average >= 90 -> "A"
        average >= 80 -> "B"
        average >= 70 -> "C"
        average >= 60 -> "D"
        else -> "E"
    }

    println("\nNilai rata-rata: %.2f".format(average))
    println("Grade: $grade")
}
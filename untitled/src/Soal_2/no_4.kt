fun main() {
    val n = 6 // Jumlah baris untuk setengah segitiga

    // Bagian atas segitiga
    for (i in 0 until n) {
        // Mencetak spasi
        for (j in 0 until i) {
            print(" ")
        }
        // Mencetak bintang
        for (j in 0 until (n - i)) {
            print("*")
        }
        println()
    }

    // Bagian bawah segitiga
    for (i in 1 until n) {
        // Mencetak spasi
        for (j in 0 until (n - i - 1)) {
            print(" ")
        }
        // Mencetak bintang
        for (j in 0 until (i + 1)) {
            print("*")
        }
        println()
    }
}
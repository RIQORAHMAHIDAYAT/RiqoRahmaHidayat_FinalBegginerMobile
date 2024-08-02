fun replaceOWithA(word: String): String {
    return word.replace('o', 'a')
}

fun main() {
    print("Masukkan kata: ")
    val originalWord = readLine() ?: ""
    val modifiedWord = replaceOWithA(originalWord)

    println("Kata sebelumnya: $originalWord")
    println("Kata setelah dirubah: $modifiedWord")
}
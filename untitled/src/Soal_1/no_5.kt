fun <T : Comparable<T>> findMinMax(list: List<T>): Pair<T?, T?> {
    val min = list.minOrNull()
    val max = list.maxOrNull()
    return Pair(min, max)
}

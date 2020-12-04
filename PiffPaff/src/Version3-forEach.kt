fun main() {
    val piff = "Piff"
    val paff = "Paff"

    val iterator = (0..100).iterator()

    iterator.forEach {
        if (it.rem(3) == 0) println(piff)
        if (it.rem(5) == 0) println(paff)
    }
}
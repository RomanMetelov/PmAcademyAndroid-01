fun main() {
    val piff = "Piff"
    val paff = "Paff"

    for (i in 0..100) {
        if (i.rem(3) == 0) println(piff + i)
        if (i.rem(5) == 0) println(paff + i)
    }
}
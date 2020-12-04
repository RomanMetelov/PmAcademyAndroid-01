fun main() {
    val piff = "Piff"
    val paff = "Paff"

    var i = 0

    while (i <= 100) {
        when {
            i.rem(3) == 0 -> println(piff+i)
        }
        when {
            i.rem(5) == 0 -> println(paff+i)
        }
        i++
    }
}
fun main() {
    println(-'b')
}
operator fun Char.unaryMinus() : Char {
    var a : Char = this
    var temp = a.code
    temp--
    a = temp.toChar()
    return a
}
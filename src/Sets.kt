package org.example

fun main() {
    val set1 = "abcdef".toSet()
    val set2 = "aeiou".toSet()
    var result = set1 union set2


    println(result)

    result = set1 intersect set2
    println(result)

    result = set1 subtract set2
    println(result)

    var Ergebnis: Int;
    Ergebnis = test(x=3,y=5)
    println(Ergebnis)

    Ergebnis = test(x=5, y=10)
    println(Ergebnis)
}

fun test(x:Int, y:Int) : Int {
    return x + y
}
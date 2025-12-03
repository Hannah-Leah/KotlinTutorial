package org.example

fun main() {
    val liste = listOf(1,2,3,4)
    val lambdaNewList = liste.map{item: Int-> item * item}
    println(lambdaNewList)
}
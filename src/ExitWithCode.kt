package org.example
import kotlin.system.exitProcess

fun main() {
    exitWithCode()
}
fun exitWithCode() {
    // we can use this to show specfic errors to users when the program finishes
    exitProcess(44)
}
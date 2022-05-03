package Basics.ScopeFunctions

fun getNullableLength(ns : String?){

    println("for \"$ns\":")
    ns?.run {
        println("\tis empty?" + isEmpty())
        println("\tlength = $length")
        length
    }
}
fun main(){
    getNullableLength(null)
    getNullableLength("")
    getNullableLength("some String with Kotlin")
}

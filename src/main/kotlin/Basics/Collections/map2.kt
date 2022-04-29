package Basics.Collections

val mapNumbers = listOf(1, -2, 3, -4, 5, -6)     // 1

val doubled = mapNumbers.map { x -> x * x }      // 2

val tripled = mapNumbers.map { it * 3 }

fun main(){
    println(doubled)
    println(tripled)
}
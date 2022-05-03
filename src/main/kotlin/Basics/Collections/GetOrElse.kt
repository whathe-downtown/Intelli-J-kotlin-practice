package Basics.Collections

val list = listOf(0,10,20)

fun main(){
    println(list.getOrElse(1) { 42 })    // 1
    println(list.getOrElse(9) { 0 })
}
package Basics.BasicSyntax

fun main(){

    val items = listOf("apple", "banna", "kiwfifruit")
    for (i in items){
        println(i)
    }

    val animal = listOf("chita", "tiger","bear")
    for (i in animal.indices){
        println("${animal[i]}")

    }
}

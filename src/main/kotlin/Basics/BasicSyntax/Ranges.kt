package Basics.BasicSyntax


private val x = 10
private val y = 10


fun main(){
    if (x in 1..y +1){
        println("fits in range")
    }
    checkif()
}

fun checkif(){
    val list = listOf("a","b","c")
    val fruits = listOf("banana", "avocado", "apple", "kiwifruit")
    fruits
        .filter { it.startsWith("a") }
        .sortedBy { it }
        .map { it.uppercase() }
        .forEach { println(it) }

    when{
        "a" in list -> println("a 가 안에 있네")

    }
    if (-1 !in 0..list.lastIndex){
        println("-1 is out of range")
    }
    if (list.size !in list.indices){
        println("list size is out of vaild list indcise range, too")
    }
}

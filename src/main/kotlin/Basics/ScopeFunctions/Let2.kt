package Basics.ScopeFunctions

fun main() {


    val str: String? = "You can edit, run, and share this code. "

    val length = str?.let {
        println("$it")
        it.length
    }
    println("$length")

    var str2 :String? = null
    val length2  = str2?.let {
        println("$it")
        it.length
    }

    println("str2 -> lenght : ${length2}")
}
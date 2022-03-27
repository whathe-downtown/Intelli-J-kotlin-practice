package Idioms

import MyAbstractClass

//data class Customer(
//    val name: String,
//    val email : String
//    // equals/ hashcode() /toString()/ copy()
//)

fun main(){
    val map = mapOf("a" to 1, "b" to 2, "c" to 3)
    println(map)
    for ((k,v) in map){
        println("$k -> $v")
    }

    val myObject = object : MyAbstractClass(){
        override fun doSomething() {
            println("hello")
        }

        override fun sleep() {
            println("sleep function gogo")
        }
    }
    myObject.doSomething()

}





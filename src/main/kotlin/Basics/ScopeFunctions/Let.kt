package Basics.ScopeFunctions

data class Person1(var name:String, var age:Int, var sex:String)

fun main(){
    val alice =Person1("Alice",20, "F")
    println(alice)

    alice.let{
        it.name ="IU"
        it.age = 22
    }
    println(alice)

    Person1("Alice", 20, "F").let {
        it.name ="IU2"
        it.age = 23
        println("${it.name}")
    }
}
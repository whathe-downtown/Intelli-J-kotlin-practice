package Basics.Functions

open class Dog {
    open fun bark(){
        println("WOW WOW")
    }
}

class Ruby: Dog(){
    override fun bark() {
        println("멈ㅇ 멍")
    }
}

fun main(){
    val dog: Dog = Ruby()
    dog.bark()
}
package Basics.Generic

fun <T> addNumbers(num1: T, num2:T) : T{
    return (num1.toString().toDouble() + num2.toString().toDouble()) as T
}
fun <T> add (a:T, b:T, op:(T,T) -> T): T{
    return op(a,b)
}

fun main(){
    println(addNumbers("1", 2.1))
    println(addNumbers(1,3) )
    println(addNumbers("10", "235") )
    println(addNumbers(1.5, 3.1) )

    println(add("1","2"){a,b -> a+b})
    println(add(1,2){a,b -> a+b})
}


package Basics.Generic

import javax.swing.text.StyledEditorKit.BoldAction

fun <T> add(a: T, b :T) : T{
    return (a.toString().toDouble() + b.toString().toDouble()) as T
}

fun <T:Number> add( a:T, b:T): T{
    return (a.toDouble() +b.toDouble()) as T
}

fun <T: Comparable<T>> compare(a:T, b:T) : Boolean{
    if(a <b) return true
    return false
}

fun <T> compare(a:T, b: T) :Boolean where T:Comparable<T>, T : Number {
    if (a<b) return true
    return false
}

fun main(){

    println(compare(1,2))
    println(compare(3,2))

    println(compare("1","2"))
    println(compare("aaaa","bbbb"))
    println(compare("cat","dog"))
}
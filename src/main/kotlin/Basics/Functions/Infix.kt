package Basics.Functions



fun main(){
    infix fun Int.times(str: String) = str.repeat(this)
    println(2 times "Bye ")

    val pair = "Ferrari" to "Katrina"
    println(pair)

    infix fun String.onto(other:String) = Pair(this, other)
    val  myPair = "McLaren" onto "Lucas"
    println(myPair)

    val sophia = Person("Sophia")
    val claudia = Person("Claudia")
    printALl("hello", "CK", "MYNAME")
}
class Person(val name: String){
    val likedPeople = mutableListOf<Person>()
    infix fun likes(other: Person) {likedPeople.add(other)}
}

fun printALl(vararg messages: String){
    for (m in messages) println(m)
}
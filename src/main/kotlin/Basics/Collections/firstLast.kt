package Basics.Collections

val firstEven = numbers.first { it % 2 == 0 }        // 4
val lastOdd = numbers.last { it % 2 != 0 }


val word = listOf("foo", "bar","baz", "faz")

val empty = emptyList<String>()

val first_empty = empty.firstOrNull()
val last_empty = empty.lastOrNull()

val firstF = word.firstOrNull{ it.startsWith('f')}
val firstZ = word.firstOrNull{it.startsWith('z')}
val lastF = word.firstOrNull { it.endsWith('z') }
val lastZ = word.lastOrNull() { it.endsWith('z') }

fun main(){
    println(firstEven)
    println(lastOdd)

    println(first_empty)
    println(last_empty)
    println(firstF)
    println(firstZ)
    println(lastF)
    println(lastZ)

}
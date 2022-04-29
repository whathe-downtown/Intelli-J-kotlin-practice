package Basics.Collections


val anyNumbers = listOf(1,-2,3,-4,5,6)

val anyNegative = anyNumbers.any {it < 0}

val anyGT6 = anyNumbers.any{ it > 6}


val allNumbers = listOf(1,-2,3-4,5,6)

val allNegative = allNumbers.all {it % 2 == 0}

val allLess6 = allNumbers.all { it <7}


val noneNumbers = listOf<Int>(1,-2,3,-4,5,-6)

val noneEven = noneNumbers.none { it % 2 ==1 }

val noneLess6 = noneNumbers.none { it >6 }


fun main(){
    println(anyNegative)
    println(anyGT6)

    println(allNegative)
    println(allLess6)

    println(noneEven)
    println(noneLess6)
}
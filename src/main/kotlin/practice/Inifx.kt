package practice

fun main() {

    sum(1,2,3,4)

    println(6 multiply 4)

    println(6.multiply(4))
}

fun sum(vararg numbers: Int){
    var sum = 0

    for (n in numbers){
        sum += n
    }
    println(sum)
}

infix fun Int.multiply(x: Int): Int =this * x
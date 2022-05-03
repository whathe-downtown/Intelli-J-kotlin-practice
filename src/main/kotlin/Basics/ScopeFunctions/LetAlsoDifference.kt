package Basics.ScopeFunctions

fun main() {

    var stringVariable = "You can edit, run, and share this code. "
    var stringVariable2 = "You can edit, run, and share this codd"

    var temp1 = stringVariable.let {
        println("length : ${it.length}")

        it.reversed()
    }

    println("let 결과갑쇼 : ${temp1}")

    var temp2 = stringVariable2.also {
        it.reversed()
    }
    println("also 결과값 : temp2: ${temp2}")
}



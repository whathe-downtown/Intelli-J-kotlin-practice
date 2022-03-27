package BasicSyntax

import java.lang.Integer.parseInt

fun main() {
    println(printPrduct("10","20"))
    println(getStringLength("hello"))
}


fun printPrduct(arg1: String, arg2: String) {
    val x = parseInt(arg1)
    val y = parseInt(arg2)

    if (x != null && y !=null ){
        print(x * y)
    }
    else{
        println("$arg1 or $arg2 is not a number")
    }
}

fun getStringLength(obj :Any): Int?{
    if( obj is String){
        return obj.length
    }
    return  null
}
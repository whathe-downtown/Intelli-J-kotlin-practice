package Functions

fun printMessage(message : String): Unit{
    println(message)
}

fun printMutiplyMessage(message: String, prefix: String){
    println("$message $prefix")
}

fun sum( x : Int, y :Int): Int{
    return x+y
}

fun mutiply ( x : Int , y:Int) = x * y

fun main(){
    println(sum(5,4))
    println(mutiply(5,4))
    printMutiplyMessage("hello", "myname is cjungkyuy")
    printMessage("ck")

}
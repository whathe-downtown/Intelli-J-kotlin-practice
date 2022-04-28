package Basics.Functions

fun main() {


    println(describeStr9ng(null))
}

fun describeStr9ng(maybeString: String?): String{
    if (maybeString != null && maybeString.length >0){
        return  "String of length ${maybeString.length}"
    } else{
        return "Empty or null String"
    }
}
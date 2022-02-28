package practice

fun main() {

    b1(::a1)

    val c: (String) -> Unit = {str -> println("$str 람다함수") }
    b1(c)

}

fun a1(str: String){
    println("$str 함수 a")
}

fun b1(function: (String)->Unit){
    function("b가 호출한")
}


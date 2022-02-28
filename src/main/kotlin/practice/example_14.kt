package practice

fun main() {

    b(::a)

}

fun a(str: String){
    println("$str 함수 a")
}

fun b(function: (String)->Unit){
    function("b가 호출한")
}


package practice

fun main(){

    doWhen(1)
    doWhen("ChungKyu")
    doWhen(12L)
    doWhen(3.14159)
    doWhen("Kotlin")



}
fun doWhen( a : Any){
    when(a){
        1 -> println("정수 입니다")
        "ChungKyu" -> println("디모의 코틀린 강좌입니다")
        is Long -> println("Long 타입입니다")
        !is String-> println("String  타입이 아닙니다")
        else -> println("이중에 아무것도 만족하지 않습니다.")
    }
}
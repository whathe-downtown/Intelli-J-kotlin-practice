package practice

// 타입추론
fun main(){
  println(add(1,2,3))
}
// 단일 표현식 함수
fun add1(a:Int, b:Int, c:Int) = a+b+c

fun add(a:Int, b:Int , c:Int): Int{
    return a+b+c
}
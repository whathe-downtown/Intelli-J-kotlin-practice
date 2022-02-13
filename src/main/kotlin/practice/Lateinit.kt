package practice

fun main(){

    val a = LateinitSample()

    println(a.getLateInitText())
    a.text =" 새로 할당한 값"
    println(a.getLateInitText())
}


class LateinitSample{
    lateinit var text: String

    fun getLateInitText(): String{
        if(::text.isInitialized){
            return text
        }else{
            return "기본값"
        }
    }
}
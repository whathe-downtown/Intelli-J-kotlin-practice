package practice


fun main(){

    var a = Person("박보영",1990)
    var b= Person("ck", 1997)
    a.introduce()
    b.introduce()

}

class Person(var name:String, var age:Int) {

    fun introduce(){
        println(message = "안녕하세요 ${name}, ${age} 입니다")
        println("거짓말입니다")
    }
}
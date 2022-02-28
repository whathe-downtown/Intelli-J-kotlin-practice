package practice

fun main(){

    var a = Pig()
    a.eat()

    a.sniff()
}

abstract class Create{
    abstract fun eat()
    fun sniff(){
        println("킁킁")
    }
}

class Pig : Create(){
    override fun eat() {
        println("돼지가 삼겹살을 먹습니다.")
    }
}
package practice

fun main() {
    var a = Drink()
    a.drink()

    var b : Drink = Cola()
    b.drink()

    if(b is Cola){
        b.washDishes()
    }

    var c = b as Cola
    c.washDishes()
}

open class Drink {
    var name  = "Drink"

    open fun drink(){
        println("${name}를 마십니다")
    }
}

class Cola: Drink(){
    var type = "콜라"

    override fun drink(){
        println("${name}중에 ${type}를 마십니다")
    }
    fun washDishes(){
        println("${type}로 설거지를 합시다")
    }
}
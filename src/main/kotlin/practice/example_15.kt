package practice

// apply

fun main(){

    var  price = 5000

    var a = Book("디모의 코틀린", 3000).apply {
        name = "[초특카]" + name
        discount()

    }
    a.run {
        println(" 상품명 : ${name}, 가격: ${price}원")
    }

    a.let {
        println("상품명: ${it.name}, 가격: ${it.price}")
    }


}

class Book(var name: String, var price: Int){

    fun discount(){
        price -=2000
    }
}
package practice

// apply

fun main(){


    var a = Beverage("펩시")
    var b = Beverage("코카")

    a.vote()
    a.vote()

    b.vote()
    b.vote()
    b.vote()

    println("${a.name}: ${a.count}")
    println("${b.name}: ${b.count}")
    println("총계 : ${Beverage.total}")
}

class  Beverage( val name : String){
    companion object{
        var total = 0
    }

    var count = 0

    fun vote(){
        total++
        count++
    }
}
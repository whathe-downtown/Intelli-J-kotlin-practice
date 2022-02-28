package practice

// apply

fun main(){


    println(Counter1.count)
    Counter1.countUp()
    Counter1.countUp()

    println(Counter1.count)
    Counter1.clear()
    println(Counter1.count)

}

object  Counter1{
    var count = 0

    fun countUp(){
        count++
    }
    fun clear(){
        count =0
    }
}
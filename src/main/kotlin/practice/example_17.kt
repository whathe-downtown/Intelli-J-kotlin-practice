package practice

fun main(){
    EventPrinter10().start()
}

interface Event{
    fun onEvent(count: Int)

}

class Count( var event: Event){
    fun count(){
        for(i in 1..100){
            if(i%5 == 0 ) event.onEvent(i)
        }
    }
}

class EventPrinter10 {
    fun start(){
        val counter = Count(object: Event{
            override fun onEvent(count: Int) {
                print("${count}-")
            }
        })
    }
}

//class EventPrinter10: Event{
//    override fun onEvent(count: Int) {
//        print("${count}-")
//    }
//    fun start(){
//        val counter = Count(this)
//        counter.cont()
//    }
//
//}

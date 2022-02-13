package practice

import kotlinx.coroutines.*

fun main(){
    runBlocking {
        val a=   launch {
            for (i in 1..5)
            {
                println(i)
                delay(10)
            }
        }
        val b = async {
            "async 종료"
        }
        println("async 대기")
        println(b.await())

        println("launch 취소")
        a.cancel()
        println("launch 종료 ")
    }
}
package SpecialClasses

enum class State{
    IDLE , RUNNING, FINISHED
}

fun main(){
    val state = State.RUNNING
    val message = when (state){
        State.IDLE -> "It's SIde"
        State.RUNNING -> "its Running"
        State.FINISHED -> "Its finished"
    }
    println(message)
}
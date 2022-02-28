package practice

fun main(){

    var a = Button()
    a.click()
}

interface Clickable{
    fun click(){
        print("인터페이스 클릭이되었습니다.")
    }
}

class Button : Clickable{
    override fun click() {
        println("I was clicked")
    }

}
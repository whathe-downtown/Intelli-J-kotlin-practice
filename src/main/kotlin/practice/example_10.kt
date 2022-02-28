package practice


fun main(){

    var a  = Animal("별이", 5,"Dog")
    var b = Dog("별이", 5)

    a.introduce()
    b.introduce()

    b.bark()

}
open class Animal(var name:String, var age:Int , var type:String){

    fun introduce(){
        println("저는 ${type} ${name}이고, ${age}살 입니다.")
    }
}

class Dog(name: String, age: Int) : Animal(name , age,"개")
{
    fun bark(){
        println("멍멍")
    }
}
package SpecialClasses

data class User(
    val name : String,
    val id : Int
    ){
    override fun equals(other: Any?)= other is User && other.id == this.id

}

fun main(){
    val user = User("Alex",1)
    println(user)

    val secondUser = User("Alex", 1)
    val thirdUser  =User("Max",2)

    println("${user == secondUser}")
    println("${user == thirdUser}")

    println(user.copy())                                   // 6
    println(user === user.copy())                          // 7
    println(user.copy("Max"))                              // 8
    println(user.copy(id = 3))                             // 9

    println("name = ${user.component1()}")                 // 10
    println("id = ${user.component2()}")
}
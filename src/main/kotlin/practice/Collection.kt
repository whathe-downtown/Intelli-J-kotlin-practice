package practice

fun main(){

    val nameList = listOf("아이유","김지수","김다현","신유나","김지우")

    nameList.forEach{ print(it + "")}
    println()

    println(nameList.filter { it.startsWith("김") })

    println(nameList.map {"dlfma:"+ it})

    println(nameList.any{it == "김지현"})
    println(nameList.all{it.length == 3})
    println(nameList.none { it.startsWith("") })

    println(nameList.first{it.startsWith("김")})
    println(nameList.last{it.startsWith("김")})
    println(nameList.count{it.contains("시")})
}


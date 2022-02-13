package practice

fun main(){
 val  a = mutableMapOf("레드벨벳" to "음파음파", "트와이스" to "Fancy", "ITZY" to "ITZY")

    for (entry in a){
        println("${entry.key} : ${entry.value}")
    }

    a.put("오마이걸", "빈지")
    println(a)

    a.remove("ITZY")
    println(a)

    println(a["레드벨벳"])
}



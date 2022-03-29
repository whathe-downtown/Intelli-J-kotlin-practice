package Idioms


fun main() {
    val list = listOf("a", "b", "c")
    val mainlist = list.firstOrNull()
    println(mainlist)

    println(transform("green"))


}

fun transform(color: String): Int {
    return when (color) {
        "Red" ->  0
        "Blue" -> 1
        "yellow" -> 2
        else -> throw IllegalStateException("Invalid color param value")
    }
}


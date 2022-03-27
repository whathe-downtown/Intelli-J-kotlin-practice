package BasicSyntax

fun main() {
    println(describe(1))
    println(describe("hello"))
    println(describe(-543_7847_7238_4723))
    println(describe(234))
    println(describe("UNKNOWN"))

}

fun describe(obj: Any): String =
    when(obj){
        1 -> "one"
        "hello" -> "Gretting"
        is Long -> "Long"
        !is String -> "is not String"
        else -> "unknown"
    }
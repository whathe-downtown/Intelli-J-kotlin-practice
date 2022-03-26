class Rectangle(var height: Double, var length: Double){
    var perimeter = (height + length) * 2
}

fun main(args: Array<String>) {
    println("Hello World!")

    val rectangle = Rectangle(5.0,2.0)
    println("${rectangle.perimeter}")
    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}
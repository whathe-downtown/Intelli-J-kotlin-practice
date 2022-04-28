package ACodingTest

import java.util.Scanner


fun main() = with(Scanner(System.`in`)){
    val year = nextInt()

    if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))  print("1")
    else println("0")
}
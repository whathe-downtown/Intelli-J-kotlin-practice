package ACodingTest

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() = with(Scanner(System.`in`)){
    print(nextDouble()/ nextDouble())


}

// 덧셈
fun main1() = with(Scanner(System.`in`)){
    val a = nextInt()
    val b= nextInt()

    println(a+b)
    println(a-b)
    println(a*b)
    println(a % b)

//    <improve version>

//    val br = BufferedReader(InputStreamReader(System.`in`))
//    val token = StringTokenizer(br.readLine())
//    println(Integer.parseInt(token.nextToken()) + Integer.parseInt(token.nextToken()))
//

}

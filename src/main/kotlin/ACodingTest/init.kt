package ACodingTest

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer


fun main() = with(System.`in`.bufferedReader()){

    val str = readLine()
    val token = StringTokenizer(str," ")

    var H =  token.nextToken().toInt()
    var M = token.nextToken().toInt()

    if (M <45){
        H--
        M = 60 - (45-M)

        if(H < 1){
            H = 23
        }
        println("${H} ${M}")

    } else{
        println("${H} ${M-45}")
    }
}
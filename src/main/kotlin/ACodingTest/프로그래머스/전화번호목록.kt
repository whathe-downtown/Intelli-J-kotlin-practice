package ACodingTest.프로그래머스

import java.util.*

fun solution(phoneBook : Array<String>) : Boolean{

    Arrays.sort(phoneBook)
    var i = 0
    while(i < phoneBook.size){
        if (!phoneBook[i+1].startsWith(phoneBook[i])) break
        return false
    }

    return true
}

fun main(){
    print(solution(arrayOf("12","123","1235","567","88")))
}
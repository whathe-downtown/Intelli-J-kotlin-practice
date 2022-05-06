package ACodingTest.프로그래머스

import java.util.*

fun solution(participant: Array<String>, completion: Array<String>): String {

    //1. 두 배열을 정렬한다
    Arrays.sort(participant)
    Arrays.sort(completion)
    var i = 0
    while (i < completion.size) {
        if (participant[i] != completion[i]) break
        i++
    }
    return participant[i]
}

fun main() {
    print(solution(arrayOf("leo", "kiki", "eden"), arrayOf("eden", "kiki")))
}
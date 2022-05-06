package ACodingTest.프로그래머스

fun solution(clothes: Array<Array<String>>): Int {
    var answer = 1
    val map = HashMap<String, Int>()
    for (cloth in clothes) {
        map[cloth[1]]?.let { map.put(cloth[1], it + 1) } ?: map.put(cloth[1], 1)
    }
    for (i in map) { answer *= (i.value +1)}
    return answer - 1
}

fun main(){

   println(solution(arrayOf(arrayOf("yellowhat","headgear"),
       arrayOf("bluesunglasses", "eyewear"),
       arrayOf("green_turban", "headgear"))))


}
package ACodingTest.프로그래머스


fun solution2(clothes: Array<Array<String>>): Int {
    val map = HashMap<String, Int>()
    for (clothe in clothes) {
        val type = clothe[1]
        map[type] = map.getOrDefault(type, 0) + 1
    }
    val it: Iterator<Int> = map.values.iterator()
    var answer = 1
    while (it.hasNext()) answer *= it.next() + 1
    return answer - 1
}


fun main(){
    println(solution2(arrayOf(arrayOf("yellowhat","headgear"),
    arrayOf("bluesunglasses", "eyewear"),
    arrayOf("green_turban", "headgear"))))
}
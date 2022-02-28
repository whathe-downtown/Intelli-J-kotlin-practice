package practice

fun main(){

    var strongman = 청규();
    strongman.meetGirlFriend()
    strongman.meetBoyFriend()

}

interface 성근{
    fun meetGirlFriend()
}
interface 상언{
    fun meetBoyFriend(){
        println("득근하로 운동을 갑니다")
    }
}

class  청규 : 성근 ,상언{
    override fun meetGirlFriend() {
        println("여자친구를 만납니다.")
    }

    override fun meetBoyFriend() {
        println("스테로이드를 꼽습니다.")
    }
}


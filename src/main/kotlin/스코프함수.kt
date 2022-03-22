
fun main(){

}


fun studyRun(){
    val phones = mutableListOf("010-9501-6619","010-1111-1111","010-2222-2222")
    val list = mutableListOf(1..10)
    val names = mutableListOf("Scott","kelly","Michael")

    val seoulPeople = SeoulPeople()

    val result= seoulPeople.person.run{
        add(Person("성근","010-4444-4444",19))
        add(Person("성근","010-4444-4444",19))
        add(Person("성근","010-4444-4444",19))
        11    //실행한 변수와 상관없이 11만 리턴된다.  주로 변수의 size 길이 필요할때
    }

//    seoulPeople.person.add(Person("성근","010-4444-4444",19))

    val resultLet=seoulPeople.person.let{ it ->  // 명시적으로 할때
        it.add(Person("성근","010-4444-4444",19))
        it.add(Person("성근","010-4444-4444",19))
        it.add(Person("성근","010-4444-4444",19))
        11
    }

    val resultApply = seoulPeople.person.apply {
        add(Person("성근","010-4444-4444",19))
        add(Person("성근","010-4444-4444",19))
        add(Person("성근","010-4444-4444",19))
        11 // 총 6개 나온다  마지막 상관없이  변수의 값을 그대로 반홚나다.
    }


    val resultAlso = seoulPeople.person.also { it->
        it.add(Person("성근","010-4444-4444",19))
        it.add(Person("성근","010-4444-4444",19))
        it.add(Person("성근","010-4444-4444",19))
        12    // 총 6개 나온다   마지막 상관없이  변수의 값을 그대로 반홚나다.
    }
}

class SeoulPeople {
    val person = mutableListOf<Person>()
    init {
        person.add(Person("성근","010-4444-4444",19))
        person.add(Person("청규","010-4444-4444",20))
        person.add(Person("상언","010-4444-4444",21))

    }

}

data class Person(
    val name:String ="",
    val phone:String = "",
    val age : Int = 21

)
package SpecialClasses

fun rentPrice(standarDays: Int, festivityDays: Int, specialDays: Int) : Unit{

    val dayRates = object {
        var standard: Int = 30 * standarDays
        var festivity: Int= 50 * festivityDays
        var special : Int =100 * specialDays
    }

    val total1 = with(dayRates ){
        standard + festivity + special
    }
    val total = dayRates.standard + dayRates.festivity + dayRates.special

    println("Total Price: $$total1")
}

object DoAuth{
    fun takeParams( userName: String, password: String){
        println("input Auth parameters = $userName:$password")
    }
}

class BigBen{
    companion object Bonger{
        fun getBongs(nTimes: Int){
            for (i in 1.. nTimes){
                println("BONG")
            }
        }
    }
}

fun main(){
    rentPrice(10, 2 , 1)
    DoAuth.takeParams("foo", "qwerty")
    BigBen.getBongs(12)
}



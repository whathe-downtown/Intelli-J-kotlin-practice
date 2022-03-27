package BasicSyntax

fun maxOf(a: Int, b:Int): Int{
    if (a>b){
        return a
    } else{
        return b
    }
}

fun maxOfanother(a:Int, b:Int) = if(a>b) a else b

fun main(){
    print(maxOfanother(0, 42))
}
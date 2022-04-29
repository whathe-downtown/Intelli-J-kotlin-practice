package Basics.Collections

const val POINTS_X_PASS : Int =15

val EzPassAccounts: MutableMap<Int,Int> = mutableMapOf(1 to 200, 2 to 100, 3 to 100)

val EzPassReport: Map<Int, Int> = EzPassAccounts

fun updatePointsCredit(accountId :Int){
    if (EzPassAccounts.containsKey(accountId)){
        println("Updating $accountId...")
        EzPassAccounts[accountId] = EzPassAccounts.getValue(accountId) + POINTS_X_PASS
    } else{
        println("ERROR : Tryinig to update a non-exisiting account (id : $accountId)")
    }
}
fun accountReport(){
    println("EZ-Pass report:")
    EzPassReport.forEach{
        k, v -> println("ID $k: credit $v")
    }
}
fun main(){
    accountReport()
    updatePointsCredit(1)
    updatePointsCredit(1)
    updatePointsCredit(5)
    accountReport()
}
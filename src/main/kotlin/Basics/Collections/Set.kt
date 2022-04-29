package Basics.Collections

val openIssues : MutableSet<String> = mutableSetOf("uniqueDescr1","uniqueDescr2","uniqueDescr3")

fun addIssue(uniqueDesc :String): Boolean{
    return openIssues.add(uniqueDesc)
}

fun getStatusLong(isAdded: Boolean): String{
    return if (isAdded) "registerd correctly" else "marked as duplicate and rejected."
}

fun main(){
    val aNewIssue: String ="uniqueDescr4"
    val anIssueAlreadyIn: String ="uniqueDescr2"

    println("Issue $aNewIssue ${getStatusLong(addIssue(aNewIssue))}")
    println("Issue $anIssueAlreadyIn ${getStatusLong(addIssue(anIssueAlreadyIn))}")
}
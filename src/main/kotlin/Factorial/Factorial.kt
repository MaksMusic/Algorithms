package Factorial

fun main() {
    println(factorial(5))
}

fun factorial(n:Int) : Int{
    var factorial = 1
    for (i in 1..n){
        factorial*=i
    }
    return factorial
}
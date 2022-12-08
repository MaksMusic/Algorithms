package Palindrome

fun main() {
    //компактнее
    println(  "ded".split("").reversed() == "ded".split(""))
    //быстрее работает
    println(isPalindrome("дед"))




}

fun isPalindrome(str:String):Boolean{
    var x = 0
    var y = str.length - 1
    while (x<y){
        if (str[x] != str[y]){
            return false
        }
        x++
        y--
    }
    return true
}
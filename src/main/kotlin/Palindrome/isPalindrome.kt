package Palindrome

fun main() {
    //����������
    println(  "ded1".split("").reversed() == "ded1".split(""))
    //������� ��������
    println(isPalindrome("���"))




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
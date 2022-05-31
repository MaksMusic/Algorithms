package MinDelitel_Evklid


fun main() {
    print(minDelitel(695,1112))
}
   fun minDelitel ( a:Int,b:Int) :Int {
       var nomer1 = a
       var nomer2 = b
        while (nomer2 !=0) {
            var tmp = nomer1%nomer2
            nomer1 = nomer2
            nomer2 = tmp
        }
        return nomer1
    }

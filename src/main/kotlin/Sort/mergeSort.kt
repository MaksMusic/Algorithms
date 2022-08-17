package Sort

fun main() {
    var arr = intArrayOf(3, 54, 1, 4, 2, 34, 21, 4, 12, 5, 6, 75, 4, 3, 22, 4, 5, 11, 7, 8, 9)
    mergeSotr(arr,0,arr.lastIndex).forEach { print("$it ") }
    //arr.forEach { print("$it ") }
}
// O(N * log N)
fun mergeSotr(arr: IntArray, startIndex: Int, endIndex: Int): IntArray {
    if (startIndex == endIndex) {
        return arr
    }
    var midlIndex = (startIndex + endIndex) / 2

    //delite
    mergeSotr(arr, startIndex, midlIndex)
    mergeSotr(arr, midlIndex + 1, endIndex)

    //sli
    compound(arr,startIndex,midlIndex,endIndex)
    return arr


}

fun compound(intArray: IntArray,startIndex: Int,midlIndex:Int,endIndex: Int) {
    //разделение масиивов на 2 части
    var left = intArray.sliceArray(startIndex..midlIndex)
    var right = intArray.sliceArray(midlIndex+1..endIndex)

    var i = 0
    var j = 0

    for (k in startIndex..endIndex){
        if (i == left.size){
            intArray[k] = right[j]
            j++
        }else if (j == right.size){
            intArray[k] = left[i]
            i++
        }else{
            if (left[i]>right[j]){
                intArray[k] = right[j]
                j++
            }else{
                intArray[k] = left[i]
                i++
            }
        }
    }

}
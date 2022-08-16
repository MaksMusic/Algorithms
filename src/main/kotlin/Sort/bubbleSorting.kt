package Sort

import java.util.*

fun main() {
    var arr = intArrayOf(3,54,1,4,2,34,2,4,2,5,6,75,4,3,2,4,5,11,7,8,9)
    bubbleSort(arr)
    println(Arrays.toString(arr))
}

fun bubbleSort(intArray: IntArray){
    for (i in intArray.indices){
        for (j in i+1 .. intArray.lastIndex){
            if (intArray[i]>intArray[j]){
                var time = intArray[j]
                intArray[j] = intArray[i]
                intArray[i] = time
            }
        }
    }
}
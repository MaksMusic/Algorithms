package Sort

import java.util.*

fun main() {
    var arr = intArrayOf(3,54,1,4,2,34,21,4,12,5,6,75,4,3,22,4,5,11,7,8,9)
    bubbleSort(arr)
    println(Arrays.toString(arr))
}

fun bubbleSort(intArray: IntArray){
    for (i in intArray.indices){
        var flag:Boolean = false
        for (j in i+1 .. intArray.lastIndex){
            if (intArray[i]>intArray[j]){
                var time = intArray[j]
                intArray[j] = intArray[i]
                intArray[i] = time
                flag = true
            }

            }

        if (!flag){
            break
        }
    }
}
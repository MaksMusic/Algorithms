package Search

import java.util.*

fun main() {

    var arr = intArrayOf(21, 44, 15, 22, 34, 12, 11, 31, 14, 5, 36, 4, 13, 12, 17, 77, 5, 34)
    arr.sort()
    println(Arrays.toString(arr))
    println(jumpSearch(arr,15))
}

//временная сложность этого поиска составляет O(sqrt (N)).
fun jumpSearch(array: IntArray, n: Int): Int {
    var arraySize = array.size
    var jumpStep = Math.sqrt(array.size.toDouble()).toInt()
    var previousStep = 0

    while (array[Math.min(arraySize, jumpStep) - 1] < n) {
        previousStep = jumpStep
        jumpStep += Math.sqrt(arraySize.toDouble()).toInt()

        if (previousStep >= arraySize)
            return -1
    }
    while (array[previousStep] < n) {
        previousStep++
        if (previousStep == Math.min(jumpStep, arraySize))
            return -1

    }
    if (array[previousStep] == n)
        return previousStep

    return -1
}
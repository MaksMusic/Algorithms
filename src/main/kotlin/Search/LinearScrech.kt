package Search

fun main() {
    var arr = intArrayOf(12, 32, 33, 55, 665, 34, 23, 2, 1, 77, 343, 77)
    println(linearSearch(arr, 77))
}

fun linearSearch(intArray: IntArray, n: Int): Int {
    for (i in intArray.indices) {
        if (intArray[i] == n)  return i
    }
    return -1
}
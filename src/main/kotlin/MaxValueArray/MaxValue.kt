package MaxValueArray

fun main() {
    var array: Array<Int> = arrayOf(11, 4, 65, 67, 234, 312, 132, 423, 2134, 432, 234, 42, 2, 2);
    var nMax = maxValue(array)
    var nMin = minValue(array)
    println(nMax)
    println(nMin)
}


fun maxValue(array: Array<Int>): Int {
    var max = array[0]
    for (i in array) {
        if (i > max) max = i
    }
    return max
}


fun minValue(array: Array<Int>) : Int{
    var n:Int = array[0]
    array.forEach { if (it < n) { n = it }
    }
    return n

}

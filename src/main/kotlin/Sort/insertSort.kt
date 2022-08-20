package Sort

fun main() {
    var arr = intArrayOf(3,54,1,4,2,34,21,4,12,5,6,75,4,3,22,4,5,11,7,8,9)
    insertSort(arr).forEach { print("$it ") }
}

fun insertSort(intArray: IntArray) : IntArray{
    for (i in 1..intArray.lastIndex) {
        var element = intArray[i]
        var indexOne = i-1

        while(indexOne >= 0 && element<intArray[indexOne]){
            indexOne --
        }
        intArray[indexOne+1] = element

    }
    return intArray
}
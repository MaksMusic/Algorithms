package Sort

fun main() {
    var arr = intArrayOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,11,7,20)
    insertSort(arr).forEach { print("$it ") }
}

//сортировка вставкой
fun insertSort(intArray: IntArray) : IntArray{
    for (i in 1..intArray.lastIndex) {
        var element = intArray[i]
        var indexOne = i-1

        while(indexOne >= 0 && element<intArray[indexOne]){
            intArray[indexOne+1] = intArray[indexOne]
            indexOne --
        }
        intArray[indexOne+1] = element

    }
    return intArray
}
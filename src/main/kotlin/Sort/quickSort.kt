package Sort

fun main() {
    var arr = intArrayOf(1,2,3,4,5)

    quickSort(arr,0,arr.size-1).forEach { print("$it ") }
}

fun quickSort(intArray: IntArray,startIndex:Int,endIndex:Int) :IntArray {

    if (startIndex >= endIndex) return intArray

    var base  = intArray[startIndex]
    var i = startIndex+1
    var j = endIndex

        while (i<=j){
            println("for 1 ")

            while (intArray[i] <= base && i<=j){
                i++
                println("while 1 ")
            }

            while (intArray[j] > base && i>=j){
                j--
                println("while 2 ")
            }
            if (i<j){
                var temp = intArray[i]
                intArray[i] = intArray[j]
                intArray[j]=temp
            }
        }
    if (intArray[startIndex]>intArray[j]){
        var temp = intArray[startIndex]
        intArray[startIndex] = intArray[j]
        intArray[j] = temp
    }

    quickSort(intArray,startIndex,j-1)
    quickSort(intArray,j+1,endIndex)

    return intArray

}
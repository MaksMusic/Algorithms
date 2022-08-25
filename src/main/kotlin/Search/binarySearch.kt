package Search

fun main() {
    var arr = intArrayOf(12, 32, 33, 55, 665, 34, 23, 2, 1, 77, 343, 77)
    println(binarySearch(arr,77))
}


fun binarySearch(intArray: IntArray,element:Int) : Int{
    var firstIndex = 0
    var lastIndex = intArray.lastIndex

    // условие прекращения (элемент не представлен)
    while (firstIndex<=lastIndex){
        var midlIndex = (firstIndex + lastIndex) / 2
            if (intArray[midlIndex] == element){
                return midlIndex
            }
        // если средний элемент меньше
        // направляем наш индекс в middle+1, убирая первую часть из рассмотрения
        else if (intArray[midlIndex] < element){
            firstIndex = midlIndex + 1
            }
        // если средний элемент больше
        // направляем наш индекс в middle-1, убирая вторую часть из рассмотрения
        else if (intArray[midlIndex] > element){
            lastIndex = midlIndex - 1
            }

    }
    return -1

}
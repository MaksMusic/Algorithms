package Search

fun main() {
    var arr = intArrayOf(12, 32, 33, 55, 665, 34, 23, 2, 1, 77, 343, 77)
    println(binarySearch(arr,77))
}


fun binarySearch(intArray: IntArray,element:Int) : Int{
    var firstIndex = 0
    var lastIndex = intArray.lastIndex

    // ������� ����������� (������� �� �����������)
    while (firstIndex<=lastIndex){
        var midlIndex = (firstIndex + lastIndex) / 2
            if (intArray[midlIndex] == element){
                return midlIndex
            }
        // ���� ������� ������� ������
        // ���������� ��� ������ � middle+1, ������ ������ ����� �� ������������
        else if (intArray[midlIndex] < element){
            firstIndex = midlIndex + 1
            }
        // ���� ������� ������� ������
        // ���������� ��� ������ � middle-1, ������ ������ ����� �� ������������
        else if (intArray[midlIndex] > element){
            lastIndex = midlIndex - 1
            }

    }
    return -1

}
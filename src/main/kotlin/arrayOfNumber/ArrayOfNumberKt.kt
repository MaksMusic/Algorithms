package arrayOfNumber

import java.util.*

fun main() {
    var age = getArray(1997);
    println(age[0])
    println(age[1])
    println(age[2])
    println(age[3])
}

fun getArray(n:Long): LongArray {
    var array = LongArray(n.toString().count())
    for (i in 0..n.toString().count()-1){
        array[i] =  n.toString()[i].toString().toLong()

    }
    return array
}
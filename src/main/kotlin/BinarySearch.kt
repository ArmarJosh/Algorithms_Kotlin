package org.example

class BinarySearch {

    fun binarySearch(numArray:List<Int>, key:Int):Boolean{
        // Assuming the array passed in ins sorted, min to max
        if(numArray.isEmpty()){
            return false
        }
        val middleIdx = numArray.size / 2
        val middleElem = numArray[middleIdx]

        return when {
            middleElem == key -> true
            middleElem < key -> {
                println("first $middleElem")
                binarySearch(numArray.subList( middleIdx+ 1, numArray.size), key)
            }
            else -> {
                println("second $middleElem")
                binarySearch(numArray.subList(0, middleIdx), key)
            }
        }
    }



    // First do recursion
    // Find the factorial of a number.
    fun factorial(num:Int):Int{
        if(num < 2){
            return num
        }else{
            return num * factorial(num -1)
        }
    }
}
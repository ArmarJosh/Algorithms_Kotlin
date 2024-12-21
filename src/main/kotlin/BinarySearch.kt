package org.example

class BinarySearch {
    /**
     * Should return a bool if the key exist or not.
     * @param numArray List of Ints
     * @param key is an Int
     * @returns true in key exists, false if it doesn't
    */
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
                binarySearch(numArray.subList( middleIdx+ 1, numArray.size), key)
            }
            else -> {
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
package org.example

class ReversArrayInPlace {
    fun reverseArrayInPlace (arr:Array<Int>):Array<Int>{

        for (i in 0 until  arr.size/2){
            val tempVar = arr[i]
            arr[i] = arr[arr.size -1 -i];
            arr[arr.size-1-i] = tempVar;
        }
        println(arr.joinToString(","))
        return arr;
    }
}
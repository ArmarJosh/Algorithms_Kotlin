package org.example

class Fibonacci {

    /**
     * Fibonacci sequence is the next number from sum of the two previous numbers
     * ie: 1,1,2,3,5,8,13,21...
     * Hence, this functions should return the value of the number at the position passed in.
     * Note: This function is very not performant, and has a log On2 time complexity.
     */
    fun fibonacci (position:Int): Int{
        // base case for recursion
        if(position < 3){
            return 1
        }else{
            return  fibonacci(position -1 ) + fibonacci(position -2)
        }
    }

    /**
     * This is a performant approach with memoization
     */
    fun fibonacciMemo(index:Int, cache:MutableMap<Int, Long> = mutableMapOf()):Long{
        if(index <= 1) return index.toLong()
        if(cache.containsKey(index)) return cache[index]!!

        val result = fibonacciMemo(index - 1, cache) + fibonacciMemo(index -2, cache)
        cache[index] = result
        return  result
    }
}
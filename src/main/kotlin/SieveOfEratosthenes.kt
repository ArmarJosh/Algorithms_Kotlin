package org.example
import kotlin.math.sqrt


class SieveOfEratosthenes {
    /**
     * Returns all a list of prime numbers till the number passed in.
     */
     fun sieveOfEratosthenes(n:Int):List<Int>{
        val isPrime = BooleanArray(n + 1) { true }
         isPrime[0] = false
         isPrime[1] = false

         for(i in 2..sqrt(n.toDouble()).toInt()){
             if(isPrime[i]){
                 for (j in i * i..n step i){
                     isPrime[j] = false
                 }
             }
         }
       // println(isPrime.joinToString())
         return isPrime.mapIndexed { index, prime ->
            if (prime) index else null
         }.filterNotNull()
     }
}
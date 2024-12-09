package org.example

class Fizzbuzz {
    fun fizzBuzz(number:Int){
        for (i in 1..number){
            if (i % 15 == 0){
                println("FizzBuzz")
            }else if(i % 3 == 0){
                println("Fizz")
            }else if(i % 5 == 0){
                println("Buzz")
            }else{
                println(i)
            }
        }
    }
}
package org.example

class Palindrome {
    fun isPalindrome(palindrome:String){
       val charactersArr = palindrome.lowercase().split("");
        val validCharacters = "abcdefghijklmnopqrstuvwxyz".split("");

        val lettersArr = mutableListOf<String>()
        for(char in charactersArr){
            if(validCharacters.indexOf(char) > -1){
                lettersArr.add(char)
            }
        }

        var isPali = false
        val singleWord = lettersArr.joinToString("")
        if(singleWord == singleWord.reversed()){
            isPali = true
        }else{
            isPali = false
        }

        println("is palindrome: $isPali")
    }
}
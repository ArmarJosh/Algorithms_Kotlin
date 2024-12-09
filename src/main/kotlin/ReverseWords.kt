package org.example

class ReverseWords {

    fun reversWords(words:String):String{
        val wordsArr = words.split(" ");
        val reverseWordsArr = mutableListOf<String>();
        for (word in wordsArr){
            // While using the reverse method
            // reverseWordsArr.add(word.reversed())

            // While not using the reverse method
            var reverseWord = "";
           for(i in word.length -1 downTo  0){
               reverseWord += word[i]
           }
            reverseWordsArr.add(reverseWord)
        }
        println(reverseWordsArr.joinToString(" "));
        return reverseWordsArr.joinToString(" ")
    }
}
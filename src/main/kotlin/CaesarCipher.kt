package org.example

class CaesarCipher {
    fun caesarCipher(str:String, _num:Int){
        val num = _num%26;
        val lowerCaseString = str.lowercase();
        val alphabet = "abcdefghijklmnopqrstuvwxyz".toList()
        var newString = "";

        for ((index, i) in lowerCaseString.withIndex()){
            val currentLetter = lowerCaseString[index];
            if(currentLetter == ' '){
                newString += currentLetter;
                continue;
            }
            val currentIndex = alphabet.indexOf(currentLetter)
            var newIndex = currentIndex + num;
            if(newIndex >25) newIndex -= 26;
            if(newIndex < 0) newIndex += 26;

            // Check if string letter was uppercase
            if(str[index].toString() == str[index].uppercase()){
                newString += alphabet[newIndex].uppercase();
            }else {
                newString += alphabet[newIndex];
            }

        }
        println(newString)

    }
}
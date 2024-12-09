package org.example

class HarmlessRansom {
    fun harmlessRansomNote(noteText:String, magazineText:String){
        val noteTextArr =  noteText.trim().lowercase().split(" ")
        val magazineTextArr =  magazineText.trim().lowercase().split(" ");

        val magazineObj  = mutableMapOf<String, Int>()

        for (word in magazineTextArr){
            if(magazineObj.containsKey(word)){
                magazineObj[word] = magazineObj[word]!! + 1
                println(magazineObj)
            }else{
                magazineObj[word] = 1
            }
        }

        var isNotePossible = true;

        for(word in noteTextArr){
            if(magazineObj.containsKey(word)){
                magazineObj[word] = magazineObj[word]!! -1

                if(magazineObj.getValue(word) < 0){
                    isNotePossible = false
              }
                println(magazineObj)
            }else{
                isNotePossible = false
            }
        }
        println("Note possible: $isNotePossible");
    }
}
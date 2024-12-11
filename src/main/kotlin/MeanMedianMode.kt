package org.example

data class Statistics(
    val mean: Double,
    val median: Double,
    val mode: List<Int>
)

class MeanMedianMode {
    fun meanMedianMode (array:Array<Int>):Statistics{

        println( "mean: ${getMean(array)}");
        println( "median: ${getMedian(array)}");
        println( "mode: ${getMode(array)}");

        return Statistics(
            mean = getMean(array),
            median = getMedian(array),
            mode = getMode(array)
        )

    }

    fun getMean(array:Array<Int>):Double{
            var sum = 0.0
            for (num in array){
                sum += num
            }

        val mean = sum / array.size
        return mean
    }

    fun getMedian (array: Array<Int>):Double{
        array.sort()
        var median:Double;
        // Solve for case where the array length is not an even number
        if(array.size % 2 != 0){
           median = array[array.size /2].toDouble()
        }else{
            val mid1 = array[(array.size / 2) -1];
            val mid2 = array[array.size /2]

            median = ((mid1 + mid2)/2).toDouble()
       }
      //  println(median)
        return median;
    }

    fun getMode(array: Array<Int>): MutableList<Int> {
        val modeObj = mutableMapOf<Int, Int>()

        for (num in array){
            if(!modeObj.containsKey(num)) modeObj[num] = 0
            modeObj[num] = modeObj[num]!! + 1
        }

        var maxFrequency = 0;
        val modes = mutableListOf<Int>()
        for ((num, frequency) in modeObj){
            if(frequency > maxFrequency){
                maxFrequency = frequency
                modes.clear()
                modes.add(num)
            }else if(frequency == maxFrequency) {
                modes.add(num)
            }
        }
        // Check if all frequencies are the same
        val uniqueFrequencies = modeObj.values.toSet()
        if (uniqueFrequencies.size == 1) {
            modes.clear()
        }

      //  println(uniqueFrequencies)
        return modes;
    }
}
package org.example

data class SumArray(
    val sumArray:List<Int>
)

class TwoSum {

    // This used a hash table to the solution.
    fun twoSum(nums: Array<Int>, target: Int): List<Pair<Int, Int>> {
        val result = mutableListOf<Pair<Int, Int>>()
        val numMap = mutableMapOf<Int, Int>()
        for (num in nums) {
            val complement = target - num
            println("complement: ${complement}")
            if (numMap.containsKey(complement)) {
                result.add(Pair(complement, num))
            }
            numMap[num] = numMap.getOrDefault(num, 0) + 1
            println("numMap: ${numMap}")
        }
        return result
    }

    // This uses nested loops, with a higher time complexity O(n2)
    fun twoSumNonPerformant(nums:Array<Int>, target: Int):List<Pair<Int, Int>>{
        val result = mutableListOf<Pair<Int, Int>>()

        for (i in nums.indices){
            // Starts on the next element after i
            println(i)
            for(j in i+1 until nums.size){
                if(nums[i] + nums[j] == target){
                    result.add(Pair(nums[i], nums[j]))
                }
            }
        }
        return  result
    }
}

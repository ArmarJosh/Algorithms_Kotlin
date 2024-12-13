package org.example

data class SumArray(
    val sumArray:List<Int>
)

class TwoSum {

    fun twoSum(nums: Array<Int>, target: Int): List<Pair<Int, Int>> {
        val result = mutableListOf<Pair<Int, Int>>()
        val numMap = mutableMapOf<Int, Int>()
        for (num in nums) {
            val complement = target - num
            if (numMap.containsKey(complement))
            { result.add(Pair(complement, num)) }
            numMap[num] = numMap.getOrDefault(num, 0) + 1 }
        return result }
}

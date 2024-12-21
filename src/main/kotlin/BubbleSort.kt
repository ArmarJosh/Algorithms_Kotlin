package org.example

class BubbleSort {

    fun bubbleSort(array: Array<Int>): Array<Int> {
        for (i in array.size - 1 downTo 1) {
            for (j in 0 until i) {
                if (array[j] > array[j + 1]) {
                    val temp = array[j] // get initials value at the position
                    array[j] = array[j + 1]; //
                    array[j + 1] = temp; // set the value to the next position
                }
            }
        }

        return array;
    }


    // OTHER SORT ALGORITHMS
    // 1. Selection Sort
    fun selectionSort(array: Array<Int>): Array<Int> {
        for (i in array.indices) {
            var minIndex = i
            for (j in i + 1 until array.size) {
                if (array[j] < array[minIndex]) {
                    minIndex = j
                }
            }
            val temp = array[minIndex]
            array[minIndex] = array[i]
            array[i] = temp
        }
        return array
    }

    // 2. Insertion Sort
    fun insertionSort(array: Array<Int>): Array<Int> {
        for (i in 1 until array.size) {
            val key = array[i]
            var j = i - 1
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j]
                j--
            }
            array[j + 1] = key }
        return array
    }

    // 3. Merge Sort
    fun mergeSort(array: Array<Int>): Array<Int> {
        if (array.size <= 1) {
            return array
        }
        val middle = array.size / 2
        val left = array.sliceArray(0 until middle)
        val right = array.sliceArray(middle until array.size)
        return merge(mergeSort(left), mergeSort(right))
    }
    fun merge(left: Array<Int>, right: Array<Int>): Array<Int> {
        var leftIndex = 0
        var rightIndex = 0
        val result = mutableListOf<Int>()
        while (leftIndex < left.size && rightIndex < right.size) {
            if (left[leftIndex] <= right[rightIndex]) {
                result.add(left[leftIndex])
                leftIndex++
            } else {
                result.add(right[rightIndex])
                rightIndex++
            } }
        result.addAll(left.slice(leftIndex until left.size))
        result.addAll(right.slice(rightIndex until right.size))
        return result.toTypedArray()
    }

    // 4. Quick Sort
    fun quickSort(array: Array<Int>, low: Int = 0, high: Int = array.size - 1): Array<Int> {
        if (low < high) {
            val pivotIndex = partition(array, low, high)
            quickSort(array, low, pivotIndex - 1)
            quickSort(array, pivotIndex + 1, high)
        }
        return array
    }

    private fun partition(array: Array<Int>, low: Int, high: Int): Int {
        val pivot = array[high]
        var i = low - 1
        for (j in low until high) {
            if (array[j] <= pivot) {
                i++
                val temp = array[i]
                array[i] = array[j]
                array[j] = temp
            }
        }
        val temp = array[i + 1]
        array[i + 1] = array[high]
        array[high] = temp
        return i + 1
    }

}
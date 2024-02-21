package easy

class SearchInsert{
    fun searchInsert(nums: IntArray, target: Int): Int {
        var leftPointer = 0
        var rightPointer = nums.size - 1
        while (leftPointer <= rightPointer) {
            val checkPointer: Int = (leftPointer + rightPointer) / 2
            if (nums[checkPointer] == target) return checkPointer
            if (nums[checkPointer] < target) {
                leftPointer = checkPointer + 1
            } else {
                rightPointer = checkPointer - 1
            }
        }
        return leftPointer
    }

}
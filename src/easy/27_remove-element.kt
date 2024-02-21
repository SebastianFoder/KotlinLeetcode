package easy

class RemoveElement {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        if (nums.isEmpty()) return 0;
        var leftPointer = 0;
        var rightPointer = nums.size - 1;
        var corrects = 0;
        while (leftPointer <= rightPointer){
            val current = nums[leftPointer];
            if(current == `val`){
                nums[leftPointer] = nums[rightPointer];
                nums[rightPointer] = current;
                rightPointer--;
            } else{
                corrects++;
                leftPointer++;
            }
        }
        return corrects;
    }
}
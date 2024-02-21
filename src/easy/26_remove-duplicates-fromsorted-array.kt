package easy

class removeDuplicates {
    fun removeDuplicates(nums: IntArray): Int {
        var corrects = 1;
        var rightPointer = 1;
        var leftPointer = 1;
        var prev = nums[0];
        while(rightPointer < nums.size){
            val current = nums[rightPointer];
            if(current != prev){
                corrects++;
                prev = current;
                nums[leftPointer] = prev;
                leftPointer++;
            }
            rightPointer++;
        }
        return corrects;
    }
}
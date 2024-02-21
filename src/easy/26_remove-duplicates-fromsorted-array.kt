package easy

class removeDuplicates {
    fun removeDuplicates(nums: IntArray): Int {
        var corrects = 1;
        var i = 1;
        var prev = nums[0];
        while(i < nums.size){
            val current = nums[i];
            if(current != prev){
                corrects++;
                prev = nums[i];
            }
            i++;
        }
        return corrects;
    }
}
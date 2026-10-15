class Solution {
    public boolean canBeIncreasing(int[] nums) {
       boolean removed = false;
        for(int i = 0; i<nums.length-1; i++){
            if(nums[i] < nums[i+1]){
                
            }
            else{
                if(removed == true){
                    return false;
                }
                else{
                    removed = true;
                }
                if (i > 0 && nums[i - 1] >= nums[i + 1]) {
                nums[i + 1] = nums[i];
            }
            }
        }
        return true;
    }
}
class Solution {
    public int dominantIndex(int[] nums) {
        int largest = -1;
        int secLargest = -1;
        int largestIndex = -1;
int secLargestIndex = -1;

        for(int i = 0; i<nums.length; i++){
            if(largest < nums[i]){
                secLargest = largest;
secLargestIndex = largestIndex;
                largest = nums[i];
                largestIndex = i;
            }
            else if(secLargest < nums[i] && nums[i] != largest){
                secLargest = nums[i];
                secLargestIndex = i;
            }
        }
        if(largest >= 2 * secLargest){
            return largestIndex;
        }
        else{return -1;}
    }
}
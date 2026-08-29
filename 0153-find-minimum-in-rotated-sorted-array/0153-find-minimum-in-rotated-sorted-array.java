class Solution {
    public int findMin(int[] nums) {
        int count=nums[0];
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                count=nums[i+1];
                break;
            }
        }
        return count;
    }
}
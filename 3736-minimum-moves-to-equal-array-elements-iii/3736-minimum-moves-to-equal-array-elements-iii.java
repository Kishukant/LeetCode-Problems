class Solution {
    public int minMoves(int[] nums) {
        int large=nums[0];
        int count=0;
        for(int num : nums){
            if (num>large){
                large=num;
            }
        }
        for(int i=0;i<nums.length;i++){
            int c=large-nums[i];
            count+=c;
        }
        return count;
    }
}
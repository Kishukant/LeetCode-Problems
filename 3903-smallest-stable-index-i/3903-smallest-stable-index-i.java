class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int large=nums[0];
        for(int i=0;i<nums.length;i++){
            int small=nums[i];
            for(int j=i;j<nums.length;j++){
                small=Math.min(small, nums[j]);
            }
            large=Math.max(large,nums[i]);
            if(large-small<=k){
                return i;
            }
        }
        return -1;
    }
}
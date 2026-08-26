class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int left=0;
        int count=0;
        int lar=0;
        for(int i=0;i<nums.length;i++){
            if(nums[left]==1 && nums[i]==1){
                count++;
            }
            else if(nums[i]==0){
                count=0;
                left=i+1;
            }
            if(lar<count){
                lar=count;
            }
        }
        return lar;
    }
}
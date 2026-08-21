class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] res=new int[nums.length];
        int leftSum=0;
        int rightSum=0;
        for(int i=0;i<nums.length;i++){
            rightSum+=nums[i];
        }
        for(int j=0;j<nums.length;j++){
            leftSum+=nums[j];
            res[j]=Math.abs(rightSum-leftSum);
            rightSum-=nums[j];
        }
        return res;
    }
}
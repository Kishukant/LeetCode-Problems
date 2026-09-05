class Solution {
    public void moveZeroes(int[] nums) {
        int a=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[a++]=nums[i];
            }
            else count++;
        }
        for(int j=nums.length-count;j<nums.length;j++){
            nums[j]=0;
        }
    }
}
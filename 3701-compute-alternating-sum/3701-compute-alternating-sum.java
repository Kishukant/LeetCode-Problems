class Solution {
    public int alternatingSum(int[] nums) {
        int sum_o=0;
        int sum_e=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                sum_e+=nums[i];
            }
            else{
                sum_o+=nums[i];
            }
        }
        return sum_e-sum_o;
    }
}
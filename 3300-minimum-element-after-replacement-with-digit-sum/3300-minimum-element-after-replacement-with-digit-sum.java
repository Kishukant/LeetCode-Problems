class Solution {
    public int minElement(int[] nums) {
        int small=nums[0];
        for(int num:nums){
            int sum=0;
            while(num>0){
                sum+=num%10;
                num/=10;
            }
            if(small>sum){
                small=sum;
            }
        }
        return small;
    }
}
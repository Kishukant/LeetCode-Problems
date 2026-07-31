class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        int sum2=0;
        int diff=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int n=nums[i];
            while(n>0){
                int d=n%10;
                n/=10;
                sum2+=d;
            }
        }
        diff=Math.abs(sum-sum2);
        return diff;
    }
}
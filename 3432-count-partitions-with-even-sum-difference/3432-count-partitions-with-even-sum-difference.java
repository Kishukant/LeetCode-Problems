class Solution {
    public int countPartitions(int[] nums) {
        int sum=0;
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            sum=sum+nums[i];
            int sum2=0;
            for(int j=i+1;j<nums.length;j++){
                sum2=sum2+nums[j];
            }
            if((sum-sum2)%2==0){
                count++;
            }
        }
        return count;
    }
}
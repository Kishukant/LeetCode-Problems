class Solution {
    public int earliestTime(int[][] nums) {
        int small=nums[0][0]+nums[0][1];
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=0;j<nums[i].length;j++){
                sum+=nums[i][j];
            }
            if(small>sum){
                small=sum;
            }
        }
        return small;
    }
}
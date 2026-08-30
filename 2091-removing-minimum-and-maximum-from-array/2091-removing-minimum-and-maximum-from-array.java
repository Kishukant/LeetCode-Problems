class Solution {
    public int minimumDeletions(int[] nums) {
        int res=nums.length;
        if(nums.length<=2){
            return res;
        }
        int small=nums[0];
        int large=nums[0];
        int add1=0;
        int add2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=small){
                small=nums[i];
                add1=i;
            }
            if(nums[i]>=large){
                large=nums[i];
                add2=i;
            }
        }
        int max=Math.max(add1,add2);
        int min=Math.min(add1,add2);
        int front=max+1;
        int back=nums.length-min;
        int bothside=(min+1)+(nums.length-max);
        
        return Math.min(front,Math.min(back,bothside));
    }
}
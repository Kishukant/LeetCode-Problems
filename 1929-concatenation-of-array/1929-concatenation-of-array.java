class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int[] result=new int[n*2];
        int idx=0;
        int ind=n+idx;
        for(int num:nums){
            result[idx++]=num;
            result[ind++]=num;
        }
        return result;
    }
}
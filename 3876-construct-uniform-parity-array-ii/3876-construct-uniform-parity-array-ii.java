class Solution {
    public boolean uniformArray(int[] nums1) {
        boolean odd=false;
        int minValue=Integer.MAX_VALUE;
        for(int num: nums1){
            minValue=Math.min(minValue,num);
            if(num%2!=0){
                odd=true;
            }
        }
        return !odd||(minValue%2!=0);
    }
}
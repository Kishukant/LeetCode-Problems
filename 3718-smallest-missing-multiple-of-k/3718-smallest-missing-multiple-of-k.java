class Solution {
    public int missingMultiple(int[] nums, int k) {
       int a=k;
       while(true){
        boolean found=false;
        for(int num:nums){
            if(num==a){
                found=true;
                break;
            }
        }
        if(!found){
            return a;
        }
        a+=k;
       }
    }
}
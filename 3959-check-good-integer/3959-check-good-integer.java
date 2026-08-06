class Solution {
    public boolean checkGoodInteger(int n) {
        int d_sum=0;
        int SQ_sum=0;
        while(n>0){
            int d=n%10;
            d_sum+=d;
            SQ_sum+=(d*d);
            n=n/10;
        }
        if(SQ_sum-d_sum>=50){
            return true;
        }
        else{
            return false;
        }
    }
}
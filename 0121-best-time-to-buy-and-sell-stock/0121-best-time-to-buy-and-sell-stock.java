class Solution {
    public int maxProfit(int[] prices) {
        int small=prices[0];
        int res=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<small){
                small=prices[i];
            }
            if((prices[i]-small)>res){
                res=prices[i]-small;
            }
        }
        return res;
    }
}
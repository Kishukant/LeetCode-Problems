class Solution {
    public int maxProfit(int[] prices) {
       int small=prices[0];
       int max=0;
       for(int i=0;i<prices.length;i++){
        if(small>prices[i]){
            small=prices[i];
        }
        else if(prices[i]-small>max){
            max=prices[i]-small;
        }
       }
       return max;
    }
}
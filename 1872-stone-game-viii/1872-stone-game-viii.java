class Solution {
    public int stoneGameVIII(int[] stones) {
        int n=stones.length;
        for(int i=1;i<n;i++){
            stones[i]+=stones[i-1];           
        }
        int dp=stones[n-1];
        for(int j=n-2;j>0;j--){
            dp=Math.max(dp,stones[j]-dp);
        }
        return dp;
    }
}
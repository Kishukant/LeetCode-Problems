class Solution {
    public int pivotInteger(int n) {
        int sum=0;
        int a=n;
        for(int i=1;i<=n;i++){
            sum+=i;
            int sum2=0;
            for(int j=i;j<=n;j++){
                sum2+=j;
            }
            if(sum==sum2){
                a=i;
                break;
            }
            else{
                a=-1;
            }
        }
        return a;
    }
}
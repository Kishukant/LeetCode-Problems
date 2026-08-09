class Solution {
    public int totalMoney(int n) {
        int sum1=0;
        int sum2=0;
        int m=n%7;
        int o=n/7;
        for(int k=o+1;k<=o+m;k++){
            sum1+=k;
        }
        if(n>7){
            for(int i=1;i<=o;i++){
                for(int j=i;j<i+7;j++){
                    sum2+=j;
                }
            }
        }
        return sum1+sum2;
    }
}
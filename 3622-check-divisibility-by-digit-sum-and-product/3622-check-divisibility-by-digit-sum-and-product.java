class Solution {
    public boolean checkDivisibility(int n) {
        int a=n;
        int sum=0;
        int pro=1;
        while(a>0){
            int d=a%10;
            sum+=d;
            pro*=d;
            a/=10;
        }
        return(n%(sum+pro)==0)?true:false;
    }
}
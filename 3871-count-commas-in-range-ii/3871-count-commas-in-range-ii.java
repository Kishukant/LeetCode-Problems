class Solution {
    public long countCommas(long n) {
        long num=1;
        int count=0;
        long result=0;
        long num2=num;
        while(num<=n){
            if(num*1000<=n){
                num=num*1000;
                result+=(num-num2)*count;
                num2*=1000;
                count++;
            }
            else{ 
                result+=(n-num+1)*count;
                break;
            }
        }
        return result;
    }
}
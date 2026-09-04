class Solution {
    public int addDigits(int num) {
        int n=num;
        if(num<10){
            return num;
        }
        else{
        while(n>=10){
            int sum=0;
            while(n>0){
                sum+=n%10;
                n/=10;
            }
            n=sum;
        }
        return n;
        }
    }
}
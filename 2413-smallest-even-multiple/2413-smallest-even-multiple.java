class Solution {
    public int smallestEvenMultiple(int n) {
        int a=2;
        for(int i=1;i<n;i++){
            if((n*i)%2==0){
                a=n*i;
                break;
            }
        }
        return a;
    }
}
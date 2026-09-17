class Solution {
    public int minOperations(int n) {
        int m=n/2;
        return(n%2==0)?(int)Math.pow(m,2):m*(m+1);
    }
}
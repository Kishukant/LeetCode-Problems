class Solution {
    public int mirrorDistance(int n) {
        int a;
        int r=0;
        int b=n;
        while(b>0){
            int d=b%10;
            r=r*10+d;
            b=b/10;
        }
        a=Math.abs(n-r);
        return a;
    }
}
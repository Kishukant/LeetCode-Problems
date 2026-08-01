class Solution {
    public int[] decode(int[] encoded, int first) {
        int n=encoded.length;
        int[] arr= new int[n+1];
        for(int i=1;i<=n;i++){
            arr[0]=first;
            arr[i]=Math.abs(encoded[i-1]^arr[i-1]);
        }
        return arr;
    }
}
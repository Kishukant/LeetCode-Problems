class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int n=friends.length;
        int m=order.length;
        int[] arr=new int[n];
        int a=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(order[i]==friends[j]){
                    arr[a]=order[i];
                    a++;
                }
            }
        }
        return arr;
    }
}
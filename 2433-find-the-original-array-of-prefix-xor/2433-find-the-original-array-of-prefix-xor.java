class Solution {
    public int[] findArray(int[] pref) {
        int[] arr=new int[pref.length];
        int res=pref[0];
        int a=1;
        arr[0]=pref[0];
        for(int i=1;i<pref.length;i++){
            res=pref[i-1]^pref[i];
            arr[a++]=res;
        }
        return arr;
    }
}
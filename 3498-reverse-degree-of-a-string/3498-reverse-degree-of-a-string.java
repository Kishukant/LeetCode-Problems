class Solution {
    public int reverseDegree(String s) {
        int[] arr=new int[26];
        int sum=0;
        for(int i=0;i<26;i++){
            arr[i]=i+1;
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            sum+=arr['z'-ch]*(i+1);
        }
        return sum;
    }
}
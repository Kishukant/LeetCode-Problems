class Solution {
    public String restoreString(String s, int[] indices) {
        char[] arr=s.toCharArray();
        char[] arr1=new char[s.length()];
        for(int i=0;i<indices.length;i++){
            arr1[indices[i]]=arr[i];
        }
        return new String(arr1);
    }
}
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] arr1=new int[26];
        int[] arr2=new int[26];
        for(int i=0;i<ransomNote.length();i++){
            char ch=ransomNote.charAt(i);
            arr1[ch-'a']++;
        }
        for(int j=0;j<magazine.length();j++){
            char ch=magazine.charAt(j);
            arr2[ch-'a']++;
        }
        for(int k=0;k<26;k++){
            if(arr1[k]>arr2[k]){
                return false;
            }
        }
        return true;
    }
}
class Solution {
    public int maximumLengthSubstring(String s) {
        int l=0;
        int max=0;
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            freq[ch-'a']++;
        while(freq[ch-'a']>2){
            freq[s.charAt(l)-'a']--;
            l++;
        }
        max=Math.max(max,i-l+1);
        }
        return max;
    }
}
class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        char[] arr=new char[words.length];
        for(int i=0;i<words.length;i++){
            int sum=0;
            String word= words[i];
            for(int j=0;j<word.length();j++){
                char ch=word.charAt(j);
                sum=sum+weights[ch-'a'];
            }
            arr[i]=(char)('z'-(sum%26));
        }
        return new String(arr);
    }
}
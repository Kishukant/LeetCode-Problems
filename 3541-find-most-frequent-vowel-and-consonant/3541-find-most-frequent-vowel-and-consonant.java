class Solution {
    public int maxFreqSum(String s) {
        int c_lar=0;
        int v_lar=0;
        for(int i=0;i<s.length();i++){
            int count=0;
            for(int j=0;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    count++;
                }
            }
            char c=s.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                if(v_lar<count){
                    v_lar=count;
                }
            }
            else{
                if(c_lar<count){
                    c_lar=count;
                }
            }
        }
        return c_lar+v_lar;
    }
}
class Solution {
    public boolean sumGame(String num) {
        int qsum=0;
        int sumd=0;
        int n=num.length();
        for(int i=0;i<n;i++){
            char ch=num.charAt(i);
            int sign=(i<n/2)?1:-1;
            if(ch=='?'){
                sumd+=sign;
            }
            else{
                qsum+=sign*(ch-'0');
            }
        }
        return(2*qsum+sumd*9)!=0;
    }
}
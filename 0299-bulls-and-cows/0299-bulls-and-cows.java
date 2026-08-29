class Solution {
    public String getHint(String secret, String guess) {
        int countB=0;
        int countC=0;
        int n=secret.length();
        boolean[] secretused=new boolean[n];
        boolean[] guessused=new boolean[n];
        for(int i=0;i<n;i++){
            if(secret.charAt(i)==guess.charAt(i)){
                countB++;
                secretused[i]=true;
                guessused[i]=true;
            }
        }
        for(int i=0;i<n;i++){
            if(!secretused[i]){
                for(int j=0;j<n;j++){
                    if(!guessused[j]&&secret.charAt(i)==guess.charAt(j)){
                        countC++;
                        guessused[j]=true;
                        break;
                    }
                }
            }
        }
        return countB +"A"+countC +"B";
    }
}
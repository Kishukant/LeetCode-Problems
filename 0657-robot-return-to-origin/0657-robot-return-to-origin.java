class Solution {
    public boolean judgeCircle(String moves) {
        int count=1;
        int c=0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='R'){
                c++;
            }
            else if(moves.charAt(i)=='L'){
                c--;
            }
            else if(moves.charAt(i)=='U'){
                count++;
            }
            else if(moves.charAt(i)=='D'){
                count--;
            }
        }
        if(count==1&&c==0){
            return true;
        }
        else{
            return false;
        }
    }
}
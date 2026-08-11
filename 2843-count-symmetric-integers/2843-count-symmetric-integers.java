class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count=0;
        for(int i=low;i<=high;i++){
            String s=String.valueOf(i);
            int len=s.length();
            if(len%2!=0){
                continue;
            }
            int mid=len/2;
            int fhalf=0;
            int shalf=0;
            for(int j=0;j<mid;j++){
                fhalf+=s.charAt(j);
                shalf+=s.charAt(mid+j);
            }
            if(fhalf==shalf){
                count++;
            }
        }
        return count;
    }
}
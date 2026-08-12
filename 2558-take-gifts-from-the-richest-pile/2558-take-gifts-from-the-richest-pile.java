class Solution {
    public long pickGifts(int[] gifts, int k) {
        long sum=0;
        for(int i=0;i<k;i++){
            int large=0;
            for(int j=1;j<gifts.length;j++){
                if(gifts[j]>gifts[large]){
                    large=j;
                }
            }
            gifts[large]=(int)Math.sqrt(gifts[large]);
        }
        for(int i:gifts){
            sum+=i;
        }
        return sum;
    }
}
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List <Boolean> lar=new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            Boolean ch=true;
            int l=candies[i];
            for(int j=0;j<candies.length;j++){
                if(candies[j]>(l+extraCandies)){
                    ch=false;
                    break;
                }
            }
            lar.add(ch);
        }
        return lar;
    }
}
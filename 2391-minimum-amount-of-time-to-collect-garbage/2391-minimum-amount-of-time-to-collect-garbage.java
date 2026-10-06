class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int count1=0;
        int count2=0;
        int count3=0;
        int lastP=0;
        int lastG=0;
        int lastM=0;
        for(int i=0;i<garbage.length;i++){
            String s=garbage[i];
            for(int j=0;j<s.length();j++){
                char ch=s.charAt(j);
                if(ch=='M'){
                    count1++;
                    lastM=i;
                }
                else if(ch=='P'){
                    count2++;
                    lastP=i;
                }
                else if(ch=='G'){
                    count3++;
                    lastG=i;
                }
            }
        }
        int[] pref=new int[travel.length+1];
        for(int i=0;i<travel.length;i++){
            pref[i+1]=pref[i]+travel[i];
        }
        int total=pref[lastM]+pref[lastP]+pref[lastG];
        return count1+count2+count3+total;
    }
}
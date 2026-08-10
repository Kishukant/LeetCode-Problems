class Solution {
    public int countDistinctIntegers(int[] nums) {
        int count=1;
        int n=nums.length*2;
        int[] arr=new int[n];
        for (int i=0;i<nums.length;i++){
            int r=0;
            int m=nums[i];
            arr[i]=m;
            while(m>0){
                r=r*10+m%10;
                m/=10;
            }
            arr[n/2+i]=r;
        }
        Arrays.sort(arr);
        for(int j=1;j<n;j++){
            if(arr[j]!=arr[j-1]){
                count++;
            }
        }
        return count;
    }
}
class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int[] arr=new int[nums.size()];
        int a=0;
        for(int str:nums){
            arr[a++]=str;
        }
        int count=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]<target){
                    count++;
                }
            }
        }
        return count;
    }
}
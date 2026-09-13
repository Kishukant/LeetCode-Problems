class Solution {
    public int findDuplicate(int[] nums) {
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[nums[i]]++;
        }
        int res=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>1){
                res=i;
            }
        }
        return res;
    }
}
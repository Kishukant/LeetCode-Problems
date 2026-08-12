class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] arr=new int[nums.length];
        int a=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                arr[a]=nums[i];
                a++;
            }
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]==pivot){
                arr[a]=nums[j];
                a++;
            }
        }
        for(int k=0;k<nums.length;k++){
            if(nums[k]>pivot){
                arr[a]=nums[k];
                a++;
            }
        }
        return arr;
    }
}
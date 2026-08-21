class Solution {
    public int[] shuffle(int[] nums, int n) {
        int left=0;
        int right=n;
        int[] arr=new int[2*n];
        for(int i=0;i<nums.length;i=i+2){
            arr[i]=nums[left++];
        }
        for(int j=1;j<nums.length;j=j+2){
            arr[j]=nums[right++];
        }
        return arr;
    }
}
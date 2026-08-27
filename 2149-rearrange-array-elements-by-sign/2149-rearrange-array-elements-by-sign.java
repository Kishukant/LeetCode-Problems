class Solution {
    public int[] rearrangeArray(int[] nums) {
        int a=0;
        int b=0;
        int n=nums.length/2;
        int[] arr=new int[n];
        int[] arr2=new int[n];
        for(int i=0;i<n*2;i++){
            if(nums[i]>0){
                arr[a++]=nums[i];
            }
            else{
                arr2[b++]=nums[i];
            }
        }
        for(int i=0;i<n;i++){
            nums[2*i]=arr[i];
            nums[(2*i)+1]=arr2[i];
        }
        return nums;
    }
}
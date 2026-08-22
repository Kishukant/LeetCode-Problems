class Solution {
    public int[] transformArray(int[] nums) {  
        int[] arr=new int[nums.length];
        Arrays.fill(arr,1);  
        int a=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                arr[a++]=0;
            }
        }
        return arr;
    }
}
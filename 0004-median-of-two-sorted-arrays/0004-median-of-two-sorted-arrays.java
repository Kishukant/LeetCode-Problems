class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length+nums2.length;
        int[] arr=new int[n];
        int left=0;
        int right=0;
        int a=0;
        while(left<nums1.length&&right<nums2.length){
            if(nums1[left]<=nums2[right]){
                arr[a]=nums1[left];
                left++;
            }
            else{
                arr[a]=nums2[right];
                right++;
            }
            a++;
        }
        while(left<nums1.length){
            arr[a]=nums1[left];
            left++;
            a++;
        }
        while(right<nums2.length){
            arr[a]=nums2[right];
            right++;
            a++;
        }
        double median;
        if(n%2==1){
            median=arr[n/2];
        }
        else{
            median=(arr[n/2]+arr[(n/2)-1])/2.0;
        }
        return median;
    }
}
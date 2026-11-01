class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int left=0;
        int right=0;
        int a=0;
        int[] arr=new int[m+n];
        while(left<m&&right<n){
            if(nums1[left]<nums2[right]){
                arr[a]=nums1[left];
                left++;
            }
            else{
                arr[a]=nums2[right];
                right++;
            }
            a++;
        }
        while(right<n){
            arr[a]=nums2[right++];
            a++;
        }
        while(left<m){
            arr[a]=nums1[left++];
            a++;
        }

        double med=0;
        if((m+n)%2==0){
            med=(arr[((m+n)/2)-1]+arr[(m+n)/2])/2.0;
        }
        else{
            med=arr[(m+n)/2];
        }
        return med;
    }
}
class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int lar = 0;

        while (left < right) {
            int area = Math.min(height[left], height[right]) * (right - left);
            if (area > lar) {
                lar = area;
            }

            // Always move the shorter pointer inward to look for a taller boundary
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return lar;
    }
}
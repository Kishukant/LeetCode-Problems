class Solution {
    public int[] findDegrees(int[][] matrix) {
        int n=matrix.length;
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                ans[j]+=matrix[i][j];
            }
        }
        return ans;
    }
}
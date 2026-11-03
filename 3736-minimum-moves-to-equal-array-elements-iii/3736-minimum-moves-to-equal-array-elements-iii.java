class Solution {
    public int minMoves(int[] nums) {
        int lar=nums[0];
        for(int i=0;i<nums.length;i++){
            if(lar<nums[i]){
                lar=nums[i];
            }
        }
        int moves=0;
        for(int j=0;j<nums.length;j++){
            moves=moves+(lar-nums[j]);
        }
        return moves;
    }
}
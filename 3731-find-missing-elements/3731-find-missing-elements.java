class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List <Integer> miss=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            int a=nums[i];
            while(nums[i+1]!=a+1){
                miss.add(a+1);
                a++;
            }
        }
        return miss;
    }
}
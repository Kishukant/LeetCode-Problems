class Solution:
    def smallerNumbersThanCurrent(self, nums: List[int]) -> List[int]:
        arr=[]
        for i in range(0,len(nums)):
            count=0
            lar=nums[i]
            for j in range(0,len(nums)):
                if lar>nums[j]:
                    count+=1
            arr.append(count)
        return arr
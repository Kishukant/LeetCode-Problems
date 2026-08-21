class Solution:
    def leftRightDifference(self, nums: List[int]) -> List[int]:
        m=len(nums)
        res=[0]*m
        leftsum=0
        rightsum=0
        for n in nums:
            rightsum+=n
        for j in range(m):
            leftsum+=nums[j]
            res[j]=abs(rightsum-leftsum)
            rightsum-=nums[j]
        return res
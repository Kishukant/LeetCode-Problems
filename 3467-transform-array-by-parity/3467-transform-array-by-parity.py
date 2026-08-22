class Solution:
    def transformArray(self, nums: List[int]) -> List[int]:
        n=len(nums)
        arr=[1]*n
        a=0
        for i in range(n):
            if nums[i]%2==0:
                arr[a]=0
                a+=1
        return arr
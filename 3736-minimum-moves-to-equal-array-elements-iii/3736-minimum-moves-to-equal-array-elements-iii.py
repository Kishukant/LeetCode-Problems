class Solution:
    def minMoves(self, nums: List[int]) -> int:
        large=max(nums)
        count=0
        for num in nums:
            d=large-num
            count+=d
        return count

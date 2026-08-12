class Solution:
    def pivotArray(self, nums: List[int], pivot: int) -> List[int]:
        arr=[]
        a=0
        for i in nums:
            if i<pivot:
                arr.append(i)
        for j in nums:
            if j==pivot:
                arr.append(j)
        for k in nums:
            if k>pivot:
                arr.append(k)
        return arr
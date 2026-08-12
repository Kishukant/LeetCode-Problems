class Solution:
    def pivotArray(self, nums: List[int], pivot: int) -> List[int]:
        s=[]
        m=[]
        l=[]
        for i in nums:
            if i<pivot:
                s.append(i)
            elif i==pivot:
                m.append(i)
            elif i>pivot:
                l.append(i)
        return s+m+l
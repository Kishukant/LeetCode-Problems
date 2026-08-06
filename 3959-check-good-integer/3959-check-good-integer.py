class Solution:
    def checkGoodInteger(self, n: int) -> bool:
        res=False
        sum=0
        S_sum=0
        while n>0:
            d=n%10
            sum+=d
            S_sum+=(d**2)
            n//=10
        if S_sum-sum>=50:
            res=True
        return res
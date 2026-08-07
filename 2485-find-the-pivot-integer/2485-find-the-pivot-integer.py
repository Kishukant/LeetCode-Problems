import math
class Solution:
    def pivotInteger(self, n: int) -> int:
        sum=(n*(n+1))//2
        x=math.isqrt(sum)
        if x*x==sum:
            return x
        else:
            return -1
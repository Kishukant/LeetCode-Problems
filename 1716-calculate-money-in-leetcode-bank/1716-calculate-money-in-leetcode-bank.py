class Solution:
    def totalMoney(self, n: int) -> int:
        sum=0
        m=n%7
        o=n//7
        for i in range(o+1,o+m+1):
            sum+=i
        if n>7:
            for j in range(1,o+1):
                for k in range(j,j+7):
                    sum+=k
        return sum
class Solution:
    def sumOfTheDigitsOfHarshadNumber(self, x: int) -> int:
        sum=0
        n=x
        while n>0:
            sum+=n%10
            n//=10
        if x%sum==0:
            return sum
        else:
            return -1
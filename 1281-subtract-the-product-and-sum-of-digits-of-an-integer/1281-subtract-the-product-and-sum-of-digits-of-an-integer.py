class Solution:
    def subtractProductAndSum(self, n: int) -> int:
        sum=0
        product=1
        r=0
        while n>0:
            d=n%10
            sum=sum+d
            product=product*d
            n=n//10
        return product-sum
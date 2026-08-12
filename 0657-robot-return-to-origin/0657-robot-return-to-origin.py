class Solution:
    def judgeCircle(self, moves: str) -> bool:
        count1=0
        count2=0
        for i in moves:
            if i=='R':
                count1+=1
            elif i=='L':
                count1-=1
            elif i=='U':
                count2+=1
            elif i=='D':
                count2-=1
        if count1==0 and count2==0:
            return True
        else:
            return False
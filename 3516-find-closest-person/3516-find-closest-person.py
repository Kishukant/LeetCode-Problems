class Solution:
    def findClosest(self, x: int, y: int, z: int) -> int:
        if int(abs(z-x)<int(abs(z-y))):
            return 1
        elif int(abs(z-y)<int(abs(z-x))):
            return 2
        else:
            return 0
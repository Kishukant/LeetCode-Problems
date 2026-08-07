class Solution:
    def largestAltitude(self, gain: List[int]) -> int:
        alt=0
        lar=0
        for i in gain:
            alt=alt+i
            if lar<alt:
                lar=alt
        return lar
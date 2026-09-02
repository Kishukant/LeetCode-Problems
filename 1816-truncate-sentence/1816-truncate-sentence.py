class Solution:
    def truncateSentence(self, s: str, k: int) -> str:
        words=s.split()
        arr=words[:k]
        return " ".join(arr)
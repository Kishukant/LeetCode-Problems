class Solution:
    def checkIfPangram(self, sentence: str) -> bool:
        if len(sentence)<26:
            return False
        for ch in string.ascii_lowercase:
            if sentence.find(ch)==-1:
                return False
        return True

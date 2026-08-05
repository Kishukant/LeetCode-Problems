class Solution:
    def reversePrefix(self, word: str, ch: str) -> str:
        for index, char in enumerate(word):
            if char == ch:
                return word[:index+1][::-1]+word[index+1:]
        return word
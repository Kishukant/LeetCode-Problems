class Solution:
    def capitalizeTitle(self, title: str) -> str:
        words=title.split()
        result=[]
        for ch in words:
            if len(ch)<=2:
                result.append(ch.lower())
            else:
                result.append(ch.capitalize())
        return " ".join(result)
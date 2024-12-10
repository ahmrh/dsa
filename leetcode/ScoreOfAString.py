class Solution:
    def scoreOfString(self, s: str) -> int:
        score = 0
        for i in range(len(s) - 1):
            c0 = s[i]
            c1 = s[i + 1]
            score += abs(ord(c0) - ord(c1))
        
        return score
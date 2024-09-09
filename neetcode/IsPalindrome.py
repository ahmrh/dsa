class Solution:
    def isPalindrome(self, s: str) -> bool:
        cleanedString = ''.join(c for c in s if c.isalnum()).lower()
        
        return cleanedString[::-1] == cleanedString
        
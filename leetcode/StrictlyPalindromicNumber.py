class Solution:
    def isStrictlyPalindromic(self, n: int) -> bool:
        
        for base in range(2, n - 1):
            n_to_base = self.decimalToBase(n, base)

            if not self.isPalindrome(n_to_base):
                return False
        
        return True 
    
    def decimalToBase(self, n: int, base: int) -> str:
        if n == 0:
            return "0"
        
        result = ""
        while n > 0:
            result = str(n % base) + result

            n //= base 
        
        return result
    
    def isPalindrome(self, s: str) -> bool:
        reversed_s = s[::-1]

        return s == reversed_s
class Solution:
    def findPermutationDifference(self, s: str, t: str) -> int:
        diff = 0
        
        for i in range(len(s)):
            
            a = s[i]

            for j in range(len(t)):
                b = t[j]
                
                if a == b:
                    diff += a 
                    break

        
        return diff
                    

                
        
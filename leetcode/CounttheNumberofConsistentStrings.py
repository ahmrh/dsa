class Solution:
    def countConsistentStrings(self, allowed: str, words: List[str]) -> int:
        count = 0

        for word in words:
            consistent = True
            for c in word:
                if c not in allowed:
                    consistent = False 

            if consistent:
                count += 1
                    

        return count
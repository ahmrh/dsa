class Solution:
    def findWordsContaining(self, words: List[str], x: str) -> List[int]:
        indices = []
        
        for i in range(len(words)):
            word = words[i]
            if x in word:
                indices.append(i)
            
        
        return indices
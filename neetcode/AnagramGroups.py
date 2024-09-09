class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        dict = {}

        for str in strs:
            key = ''.join(sorted(str))
            if key in dict:
                dict[key].append(str)
            else:
                dict[key] = [str]
        
        anagrams = [[]]
        for value in dict.values():
            anagrams.append(value)
        
        print(anagrams)

        return anagrams
                

            
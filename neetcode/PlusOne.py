class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:

        i = len(digits) - 1
        remainder = 1

        while remainder == 1 and i >= 0: 
            digits[i] += 1
            remainder -= 1

            if digits[i] == 10:
                digits[i] = 0
                remainder = 1
            
            i -= 1
        
        if remainder == 1:
            digits.insert(0, 1)
        
        return digits
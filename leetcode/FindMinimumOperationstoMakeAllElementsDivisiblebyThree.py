class Solution:
    def minimumOperations(self, nums: List[int]) -> int:
        operation = 0
        
        for num in nums:
            mod = num % 3
            operation += min(mod, 3 - mod)

        return operation 
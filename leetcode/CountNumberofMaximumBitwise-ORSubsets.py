class Solution:
    def countMaxOrSubsets(self, nums: List[int]) -> int:
        maxOrValue = 0
        maxCount = 0  
        n = len(nums)

        for i in range(1 << n): 
            orValue = 0

            for j in range(n):
                if i & (1 << j):  
                    orValue |= nums[j]
            
            if orValue > maxOrValue:
                maxOrValue = orValue
                maxCount = 1 
            elif orValue == maxOrValue:
                maxCount += 1 
        
        return maxCount

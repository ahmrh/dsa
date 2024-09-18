class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        
        output = []
        prefix = 1 

        for i in range(len(nums)):
            num = nums[i]
            output.append(prefix)
            prefix *= num

        postfix = 1
        for i in range(len(nums) - 1, -1, -1):
            num = nums[i]
            output[i] *= postfix 
            postfix *= num 

        return output



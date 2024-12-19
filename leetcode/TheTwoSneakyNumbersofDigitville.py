class Solution:
    def getSneakyNumbers(self, nums: List[int]) -> List[int]:

        sneaky_num = []

        sorted_nums = sorted(nums)
        n = len(sorted_nums)

        for i in range(1, n):
            num0 = sorted_nums[i - 1]
            num1 = sorted_nums[i]

            if num0 == num1:
                sneaky_num.append(num0)
        
        return sneaky_num
            
            

        
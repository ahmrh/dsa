class Solution:
    def search(self, nums: List[int], target: int) -> int:
        self.nums = nums 
        self.target = target

        return self.binarySearch(0, len(nums) - 1)
        
    
    def binarySearch(self, start, end) -> int:
        if start > end: 
            return -1
            
        middle = start + (end - start) // 2

        if self.nums[middle] < self.target:
            return self.binarySearch(middle + 1, end)
        elif self.nums[middle] > self.target:
            return self.binarySearch(start, middle - 1)
        else:
            return middle
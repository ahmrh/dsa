class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        # for i in range(len(nums)):
         #   for j in range(i + 1, len(nums)):
          #         return [i, j]

        map = {}
        for i in range(len(nums)):
            a = nums[i]
            b = target - a

            if b in map:
                return [map[b], i]
            else:
                map[a] = i
                
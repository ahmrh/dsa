from typing import List


class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        counter_dict = { i + 1: [] for i in range(len(nums), 0) }
        
        for num in nums:
            num_count = nums.count(num)

            counter_dict[num_count].append(num)
        
        freq = []
        i = 0

        for key in counter_dict:
            if len(counter_dict[key]) > 0:
                for num in counter_dict[key]:
                    freq.append(num)
                    i += 1

                    if i == k: 
                        return freq

        
        
from heapq import heapify, heappush, heappop 


class KthLargest:

    def __init__(self, k: int, nums: List[int]):
        self.k = k 
        self.heap = nums
        heapify(self.heap)

        while len(self.heap) > self.k:
            heappop(self.heap)


    def add(self, val: int) -> int:
        heappush(self.heap, val)

        while len(self.heap) > self.k:
            heappop(self.heap)


        return self.heap[0]
    
    

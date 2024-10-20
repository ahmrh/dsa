from heapq import heappush, heapify, heappop

class Solution:
    def lastStoneWeight(self, stones: List[int]) -> int:
        self.heap = []
        heapify(self.heap)

        for stone in stones:
            heappush(self.heap, -1 * stone)

        while len(self.heap) > 1:
            x = -1 * heappop(self.heap)
            y = -1 * heappop(self.heap)

            self.z = max(x, y) - min(x, y)

            if self.z != 0:
                heappush(self.heap, -1 * self.z)

        
        if len(self.heap) != 0:
            return -1 * heappop(self.heap)
        
        return self.z
    
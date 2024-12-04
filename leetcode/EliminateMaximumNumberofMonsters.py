from typing import List


class Solution:
    def eliminateMaximum(self, dist: List[int], speed: List[int]) -> int:
        self.dist = dist 
        self.speed = speed
        self.n = len(dist)

        monsterEliminated = 0

        while not self.isMonsterReachesCity:
            self.moveMonster()
            print(self.dist)
    
    def isMonsterReachesCity(self) -> bool:
        for dist in self.dist:
            print(dist)
            if dist < 0: 
                return True
        
        return False
        
    def moveMonster(self):
        for i in range(self.n):
            self.dist[i] -= self.speed[i]

solution = Solution()
solution.eliminateMaximum([1,3,4], [1,1,1])
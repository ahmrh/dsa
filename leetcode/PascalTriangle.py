
from typing import List


class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        pascalTriangleList = [ [1] ]

        for i in range(1, numRows):
            row = []
            for j in range(i + 1):
                a = 0 if j - 1 < 0 else pascalTriangleList[i - 1][j - 1]
                b = 0 if j >= i else pascalTriangleList[i - 1][j]

                row.append(a + b)
            
            pascalTriangleList.append(row)
            
        
        return pascalTriangleList
            
    
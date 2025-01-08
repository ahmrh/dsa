class Solution:
    def minOperations(self, boxes: str) -> List[int]:
        listOperations = []

        n = len(boxes)

        for i in range(n):
            operations = 0
            for j in range(n):
                if i == j: 
                    continue

                if boxes[j] == '1':
                    operations += abs(j - i)
            
            
            listOperations.append(operations)
        
        return listOperations
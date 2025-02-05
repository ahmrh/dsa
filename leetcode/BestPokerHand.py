class Solution:
    def bestHand(self, ranks: List[int], suits: List[str]) -> str:
        self.n = len(ranks)

        if self.isFlush(suits):
            return "Flush"

        mostRankCount = self.mostRankCount(ranks)

        if mostRankCount >= 3:
            return "Three of a Kind"

        if mostRankCount == 2:
            return "Pair"
        
        return "High Card"
    
    def isFlush(self, suits: List[str]):
        suitCheck = suits[0]
        isFlush = True

        for suit in suits:
            if suit != suitCheck:
                isFlush = False
                break

        return isFlush
    
    def mostRankCount(self, ranks: List[int]):
        mostCount = 0

        for i in range(self.n):
            count = 1
            for j in range(i + 1, self.n):
                if ranks[i] == ranks[j]:
                    count += 1
            
            if mostCount < count:
                mostCount = count

        return mostCount
    
            
        